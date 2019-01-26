package server;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class NadawcaResource {
    NadawcaRepository nadawcaRepository;

    public NadawcaResource(NadawcaRepository nadawcaRepository){
        this.nadawcaRepository = nadawcaRepository;
    }

    @RequestMapping(value = "/nadawca", method = RequestMethod.GET)
    public List<Nadawca> getAll(){
        return new ArrayList<>(nadawcaRepository.findAll());
    }

    @RequestMapping(value = "/nadawca/{ID}", method = RequestMethod.GET)
    public Nadawca getNadawca(@PathVariable Integer ID){
        return nadawcaRepository.findById(ID).orElseThrow(() -> new NadawcaNotFoundException(ID));
    }

    @RequestMapping(value = "/nadawca", method = RequestMethod.POST)
    public Nadawca newNadawca(@RequestBody Nadawca newNadawca) {

        return changeNadawca(newNadawca);
    }

    private Nadawca changeNadawca(Nadawca newNadawca) {
        if(newNadawca.getID() == null){
            newNadawca.setID(-1);
        }
        return nadawcaRepository.findById(newNadawca.getID())
                .map(nadawca -> {
                    nadawca.setNumer_konta(newNadawca.getNumer_konta());
                    nadawca.setAdres(newNadawca.getAdres());
                    nadawca.setHaslo(newNadawca.getAdres());
                    nadawca.setImie_I_Nazwisko(newNadawca.getImie_I_Nazwisko());
                    nadawca.setKod_Pocztowy(newNadawca.getKod_Pocztowy());
                    nadawca.setLogin(newNadawca.getLogin());
                    nadawca.setMiejscowosc(newNadawca.getMiejscowosc());

                    System.out.println("UPDATED NADAWCA ID: " + nadawca.getID());
                    return nadawcaRepository.save(nadawca);
                })
                .orElseGet(() -> {
                    if(nadawcaRepository.findAll().size() != 0)
                        newNadawca.setID(nadawcaRepository.findAllByOrderByIDDesc().get(0).getID()+1);
                    else
                        newNadawca.setID(1);

                    System.out.println("CREATED NADAWCA ID: " + newNadawca.getID());
                    return nadawcaRepository.save(newNadawca);
                });
    }
}

class NadawcaNotFoundException extends RuntimeException{
    public NadawcaNotFoundException(Integer ID){
        super("404 Nadawca with id "+ID+" not found");
    }
}
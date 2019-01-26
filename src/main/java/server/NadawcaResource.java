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

        System.out.println(" Created new Nadawca with ID: "+newNadawca.getID()+" Name: "+newNadawca.getImie_I_Nazwisko()+" Login: "+newNadawca.getLogin()+" Haslo: "+newNadawca.getHaslo()+ " Numer konta: "+newNadawca.getNumer_konta()+" Miejscowosc: "+newNadawca.getMiejscowosc()+" Kod pocztowy: "+newNadawca.getKod_Pocztowy()+" Adres: "+newNadawca.getAdres()+" ");
        return nadawcaRepository.save(newNadawca);
    }
}

class NadawcaNotFoundException extends RuntimeException{
    public NadawcaNotFoundException(Integer ID){
        super("404 Nadawca with id "+ID+" not found");
    }
}
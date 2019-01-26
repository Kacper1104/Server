package server;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class OdbiorcaResource {
    OdbiorcaRepository odbiorcaRepository;

    public OdbiorcaResource(OdbiorcaRepository odbiorcaRepository){
        this.odbiorcaRepository = odbiorcaRepository;
    }

    @GetMapping("/odbiorca")
    public List<Odbiorca> getAll(){
        return odbiorcaRepository.findAll();
    }

    @RequestMapping(value = "/odbiorca/{ID}", method = RequestMethod.GET)
    public Odbiorca getOdbiorca(@PathVariable Integer ID){
        return odbiorcaRepository.findById(ID).orElseThrow(() -> new OdbiorcaNotFoundException(ID));
    }

    @RequestMapping(value = "/odbiorca", method = RequestMethod.POST)
    public Odbiorca newOdbiorca(@RequestBody Odbiorca newOdbiorca) {

        return changeOdbiorca(newOdbiorca);
    }

    private Odbiorca changeOdbiorca(Odbiorca newOdbiorca) {
        if(newOdbiorca.getID() == null){
            newOdbiorca.setID(-1);
        }
        return odbiorcaRepository.findById(newOdbiorca.getID())
                .map(odbiorca -> {
                    odbiorca.setAdnotacje(newOdbiorca.getAdnotacje());
                    odbiorca.setAdres(newOdbiorca.getAdres());
                    odbiorca.setHaslo(newOdbiorca.getHaslo());
                    odbiorca.setImie_I_Nazwisko(newOdbiorca.getImie_I_Nazwisko());
                    odbiorca.setKod_Pocztowy(newOdbiorca.getKod_Pocztowy());
                    odbiorca.setLogin(newOdbiorca.getLogin());
                    odbiorca.setMiejscowosc(newOdbiorca.getMiejscowosc());

                    System.out.println("UPDATED ODBIORCA ID: " + odbiorca.getID());
                    return odbiorcaRepository.save(odbiorca);
                })
                .orElseGet(() -> {
                    if(odbiorcaRepository.findAll().size() != 0)
                        newOdbiorca.setID(odbiorcaRepository.findAllByOrderByIDDesc().get(0).getID()+1);
                    else
                        newOdbiorca.setID(1);

                    System.out.println("CREATED ODBIORCA ID: " + newOdbiorca.getID());
                    return odbiorcaRepository.save(newOdbiorca);
                });
    }
}

class OdbiorcaNotFoundException extends RuntimeException{
    public OdbiorcaNotFoundException(Integer ID){
        super("404 Odbiorca with id "+ID+" not found");
    }
}
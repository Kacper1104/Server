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

        System.out.println(" Created new Nadawca with ID: "+newOdbiorca.getID()+" Name: "+newOdbiorca.getImie_I_Nazwisko()+" Login: "+newOdbiorca.getLogin()+" Haslo: "+newOdbiorca.getHaslo()+ " Adnotacje: "+newOdbiorca.getAdnotacje()+" Miejscowosc: "+newOdbiorca.getMiejscowosc()+" Kod pocztowy: "+newOdbiorca.getKod_Pocztowy()+" Adres: "+newOdbiorca.getAdres());
        return odbiorcaRepository.save(newOdbiorca);
    }
}

class OdbiorcaNotFoundException extends RuntimeException{
    public OdbiorcaNotFoundException(Integer ID){
        super("404 Odbiorca with id "+ID+" not found");
    }
}
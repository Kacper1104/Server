package server;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class PrzesylkaResource {
    PrzesylkaRepository przesylkaRepository;

    public PrzesylkaResource(PrzesylkaRepository przesylkaRepository){
        this.przesylkaRepository= przesylkaRepository;
    }

    @RequestMapping(value = "/przesylka", method = RequestMethod.GET)
    public List<Przesylka> getAll(){
        return przesylkaRepository.findAll();
    }

    @RequestMapping(value = "/przesylka/{ID}", method = RequestMethod.GET)
    public Przesylka getPrzesylka(@PathVariable Integer ID){
        return przesylkaRepository.findById(ID).orElseThrow(() -> new PrzesylkaNotFoundException(ID));
    }

    @RequestMapping(value = "/przesylka", method = RequestMethod.POST)
    public Przesylka newPrzesylka(@RequestBody Przesylka newPrzesylka) {
        return changePrzesylka(newPrzesylka);
    }

    private Przesylka changePrzesylka(Przesylka newPrzesylka) {
        if(newPrzesylka.getID() == null){
            newPrzesylka.setID(-1);
        }
        return przesylkaRepository.findById(newPrzesylka.getID())
                .map(przesylka -> {
                    przesylka.setData_nadania(newPrzesylka.getData_nadania());
                    przesylka.setKoszt_Do_Zaplaty(newPrzesylka.getKoszt_Do_Zaplaty());
                    przesylka.setLista_rozwozowa_ID(newPrzesylka.getLista_rozwozowa_ID());
                    if (przesylka.getLista_rozwozowa_ID() != null) {
                        przesylka.setNa_liscie_rozwozowej(true);
                    } else {
                        przesylka.setNa_liscie_rozwozowej(false);
                    }
                    przesylka.setNadawca_ID(newPrzesylka.getNadawca_ID());
                    przesylka.setOdbiorca_ID(newPrzesylka.getOdbiorca_ID());
                    przesylka.setOpcja_dostawy(newPrzesylka.getOpcja_dostawy());
                    przesylka.setProba_dostarczenia(newPrzesylka.getProba_dostarczenia());
                    przesylka.setOstatnia_zmiana_statusu(newPrzesylka.getOstatnia_zmiana_statusu());
                    przesylka.setStatus_przesylki(newPrzesylka.getStatus_przesylki());

                    System.out.println("UPDATED PRZESYLKA ID: " + przesylka.getID());
                    return przesylkaRepository.save(przesylka);
                })
                .orElseGet(() -> {
                    newPrzesylka.setID(przesylkaRepository.findAll().get((przesylkaRepository.findAll().size()-1)).getID()+1);

                    System.out.println("CREATED PRZESYKLKA ID: " + newPrzesylka.getID());
                    return przesylkaRepository.save(newPrzesylka);
                });
    }
}

class PrzesylkaNotFoundException extends RuntimeException{
    public PrzesylkaNotFoundException(Integer ID){
        super("404 Przesylka with id "+ID+" not found");
    }
}

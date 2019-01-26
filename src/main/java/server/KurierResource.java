package server;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/rest")
public class KurierResource{
    KurierRepository kurierRepository;

    public KurierResource(KurierRepository kurierRepository){
        this.kurierRepository = kurierRepository;
    }

    @RequestMapping(value = "/kurier", method = RequestMethod.GET)
    public List<Kurier> getAll(){
        return new ArrayList<Kurier>(kurierRepository.findAll());
    }

    @RequestMapping(value="/kurier/{ID}", method = RequestMethod.GET)
    public Kurier getKurier(@PathVariable Integer ID){
        return kurierRepository.findById(ID).orElseThrow(() -> new KurierNotFoundException(ID));
    }

    @RequestMapping(value = "/kurier", method = RequestMethod.POST)
    public Kurier newKurier(@RequestBody Kurier newKurier) {

        System.out.println(" Created new Kurier with ID: "+newKurier.getID()+" Name: "+newKurier.getImie_I_Nazwisko()+" Login: "+newKurier.getLogin()+" Haslo: "+newKurier.getHaslo()+" Lista rozwozowa: "+newKurier.getLista_rozwozowa_ID());
        return kurierRepository.save(newKurier);
    }
}

class KurierNotFoundException extends RuntimeException {
    KurierNotFoundException(Integer ID) {
        super("404 Kurier with id "+ID+" not found");
    }
}

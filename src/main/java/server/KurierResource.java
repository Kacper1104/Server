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
}

class KurierNotFoundException extends RuntimeException {
    KurierNotFoundException(Integer ID) {
        super("404 Kurier with id "+ID+" not found");
    }
}

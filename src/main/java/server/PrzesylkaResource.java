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

        System.out.println(" Created new Przesylka");
        return przesylkaRepository.save(newPrzesylka);
    }
}

class PrzesylkaNotFoundException extends RuntimeException{
    public PrzesylkaNotFoundException(Integer ID){
        super("404 Przesylka with id "+ID+" not found");
    }
}

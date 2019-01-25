package server;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class PrzesylkaResource {
    PrzesylkaRepository przesylkaRepository;

    public PrzesylkaResource(PrzesylkaRepository przesylkaRepository){
        this.przesylkaRepository= przesylkaRepository;
    }

    @RequestMapping(value = "/przesylka", method = RequestMethod.GET)
    public PrzesylkaList getAll(){
        return new PrzesylkaList(przesylkaRepository.findAll());
    }
}
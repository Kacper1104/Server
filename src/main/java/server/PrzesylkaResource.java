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
    public List<Przesylka> get(){
        return przesylkaRepository.findAll();
    }
}
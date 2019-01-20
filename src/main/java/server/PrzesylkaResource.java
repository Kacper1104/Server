package server;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class PrzesylkaResource {
    PrzesylkaRepository przesylkaRepository;

    public PrzesylkaResource(PrzesylkaRepository przesylkaRepository){
        this.przesylkaRepository= przesylkaRepository;
    }

    @GetMapping("/przesylka")
    public List<Przesylka> getPrzesylka(){
        return (List<Przesylka>) przesylkaRepository.findAll();
    }
}
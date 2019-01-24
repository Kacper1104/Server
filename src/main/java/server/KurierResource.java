package server;

import org.springframework.web.bind.annotation.*;

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
    public Iterable<Kurier> get(){
        return kurierRepository.findAll();
    }
}
package server;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class NadawcaResource {
    NadawcaRepository nadawcaRepository;

    public NadawcaResource(NadawcaRepository nadawcaRepository){
        this.nadawcaRepository = nadawcaRepository;
    }

    @RequestMapping(value = "/nadawcy", method = RequestMethod.GET)
    public List<Nadawca> getAll(){
        return new ArrayList<>(nadawcaRepository.findAll());
    }

    @RequestMapping(value = "/nadawcy/{ID}", method = RequestMethod.GET)
    public Nadawca getNadawca(@PathVariable Integer ID){
        return nadawcaRepository.findById(ID).orElseThrow(() -> new NadawcaNotFoundException(ID));
    }
}

class NadawcaNotFoundException extends RuntimeException{
    public NadawcaNotFoundException(Integer ID){
        super("404 Nadawca with id "+ID+" not found");
    }
}
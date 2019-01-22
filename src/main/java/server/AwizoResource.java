package server;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class AwizoResource {
    AwizoRepository awizoRepository;

    public AwizoResource(AwizoRepository awizoRepository){
        this.awizoRepository = awizoRepository;
    }

    @GetMapping("/awizo")
    public List<Awizo> getAwizo(){
        return awizoRepository.findAll();
    }


}

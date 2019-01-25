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

    @RequestMapping(value = "/awizo", method = RequestMethod.GET)
    public AwizoList getAll(){
        return new AwizoList(awizoRepository.findAll());
    }

    @RequestMapping(value = "/awizo/{id}", method = RequestMethod.GET)
    public Awizo getAwizo(@PathVariable Integer ID){
        return awizoRepository.findById(ID).orElseThrow(() -> new AwizoNotFoundException(ID));
    }


}
class AwizoNotFoundException extends RuntimeException {

     AwizoNotFoundException(Integer id) {
        super("404 Awizo with id "+id+" not found");
    }
}

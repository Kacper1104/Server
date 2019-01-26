package server;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public List<Awizo> getAll(){
        return new ArrayList<Awizo>(awizoRepository.findAll());
    }

    @RequestMapping(value = "/awizo/{ID}", method = RequestMethod.GET)
    public Awizo getAwizo(@PathVariable Integer ID){
        return awizoRepository.findById(ID).orElseThrow(() -> new AwizoNotFoundException(ID));
    }

    @RequestMapping(value = "/awizo", method = RequestMethod.POST)
    public Awizo newAwizo(@RequestBody Awizo newAwizo) {

        return changeAwizo(newAwizo);
    }

    public Awizo changeAwizo(Awizo newAwizo){
        if(newAwizo.getID() == null){
            newAwizo.setID(-1);
        }
        return awizoRepository.findById(newAwizo.getID())
                .map(awizo -> {
                    awizo.setData_zostawienia(newAwizo.getData_zostawienia());
                    awizo.setPrzesylka_ID(newAwizo.getPrzesylka_ID());

                    System.out.println("UPDATED AWIZO ID: " + awizo.getID());
                    return awizoRepository.save(awizo);
                })
                .orElseGet(() -> {
                    if(awizoRepository.findAll().size() != 0)
                        newAwizo.setID(awizoRepository.findAllByOrderByIDDesc().get(0).getID()+1);
                    else
                        newAwizo.setID(1);

                    System.out.println("CREATED KURIER ID: " + newAwizo.getID());
                    return awizoRepository.save(newAwizo);
                });
    }
}

class AwizoNotFoundException extends RuntimeException {

     AwizoNotFoundException(Integer ID) {
        super("404 Awizo with id "+ID+" not found");
    }
}

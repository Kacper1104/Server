package server;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class MagazynierResource {
    MagazynierRepository magazynierRepository;

    public MagazynierResource(MagazynierRepository magazynierRepository){
        this.magazynierRepository = magazynierRepository;
    }

    @RequestMapping(value="/magazynier", method = RequestMethod.GET)
    public List<Magazynier> getAll(){
        return new ArrayList<>(magazynierRepository.findAll());
    }

    @RequestMapping(value = "/magazynier/{ID}", method = RequestMethod.GET)
    public Magazynier getMagazynier(@PathVariable Integer ID){
        return magazynierRepository.findById(ID).orElseThrow(() -> new MagazynierNotFoundException(ID));
    }

    @RequestMapping(value = "/magazynier", method = RequestMethod.POST)
    public Magazynier newMagazynier(@RequestBody Magazynier newMagazynier) {

        System.out.println(" Created new Magazynier with ID: "+newMagazynier.getID()+" Login: "+newMagazynier.getLogin()+" Haslo: "+newMagazynier.getHaslo());
        return magazynierRepository.save(newMagazynier);
    }

}

class MagazynierNotFoundException extends RuntimeException {
    MagazynierNotFoundException(Integer ID) {
        super("404 Magazynier with id "+ID+" not found");
    }
}

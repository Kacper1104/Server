package server;


import org.springframework.web.bind.annotation.*;

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
    public MagazynierList getAll(){
        return new MagazynierList(magazynierRepository.findAll());
    }

    @RequestMapping(value = "/magazynier/{ID}", method = RequestMethod.GET)
    public Magazynier getMagazynier(@PathVariable Integer ID){
        return magazynierRepository.findById(ID).orElseThrow(() -> new MagazynierNotFoundException(ID));
    }
}

class MagazynierNotFoundException extends RuntimeException {
    MagazynierNotFoundException(Integer ID) {
        super("404 Magazynier with id "+ID+" not found");
    }
}

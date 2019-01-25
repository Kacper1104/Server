package server;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rest")
public class Lista_rozwozowaResource{
    Lista_rozwozowaRepository lista_rozwozowaRepository;

    public Lista_rozwozowaResource(Lista_rozwozowaRepository lista_rozwozowaRepository){
        this.lista_rozwozowaRepository = lista_rozwozowaRepository;
    }

    @RequestMapping(value = "/lista_rozwozowa", method = RequestMethod.GET)
    public Lista_rozwozowaList getAll(){
        return new Lista_rozwozowaList(lista_rozwozowaRepository.findAll());
    }

    @RequestMapping(value="/lista_rozwozowa/{ID}", method = RequestMethod.GET)
    public Lista_rozwozowa getLista_rozwozowa(@PathVariable Integer ID){
        return lista_rozwozowaRepository.findById(ID).orElseThrow(() -> new Lista_rozwozowaNotFoundException(ID));
    }

    @RequestMapping(value = "/lista_rozwozowa", method = RequestMethod.POST)
    public Lista_rozwozowa getNewLista_rozwozowa(@RequestBody Lista_rozwozowa newLista_rozwozowa) {
        System.out.println("Przyjalem");
        return lista_rozwozowaRepository.save(newLista_rozwozowa);
    }
}

class Lista_rozwozowaNotFoundException extends RuntimeException {
    Lista_rozwozowaNotFoundException(Integer ID) {
        super("404 Lista rozwozowa with id "+ID+" not found");
    }
}

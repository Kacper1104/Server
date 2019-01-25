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

    @RequestMapping(value="/lista_rozwozowa/{id}", method = RequestMethod.GET)
    public Lista_rozwozowa getLista_rozwozowa(@PathVariable Integer ID){
        return lista_rozwozowaRepository.findById(ID).orElseThrow(() -> new Lista_rozwozowaNotFoundException(ID));
    }
}

class Lista_rozwozowaNotFoundException extends RuntimeException {
    Lista_rozwozowaNotFoundException(Integer id) {
        super("404 Lista rozwozowa with id "+id+" not found");
    }
}

package server;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public List<Lista_rozwozowa> getAll(){
        return new ArrayList<>(lista_rozwozowaRepository.findAll());
    }

    @RequestMapping(value="/lista_rozwozowa/{ID}", method = RequestMethod.GET)
    public Lista_rozwozowa getLista_rozwozowa(@PathVariable Integer ID){
        return lista_rozwozowaRepository.findById(ID).orElseThrow(() -> new Lista_rozwozowaNotFoundException(ID));
    }

    @RequestMapping(value = "/lista_rozwozowa", method = RequestMethod.POST)
    public Lista_rozwozowa newLista_rozwozowa(@RequestBody Lista_rozwozowa newLista_rozwozowa) {

        System.out.println("ID: "+newLista_rozwozowa.getID()+" Date: "+newLista_rozwozowa.getData().toString()+" Magazynier: "+newLista_rozwozowa.getMagazynier_ID());
        return changeListaRozwozowa(newLista_rozwozowa);
    }

    private Lista_rozwozowa changeListaRozwozowa(Lista_rozwozowa newLista_rozwozowa) {

        return lista_rozwozowaRepository.findById(newLista_rozwozowa.getID())
                .map(lista_rozwozowa -> {
                    lista_rozwozowa.setData(newLista_rozwozowa.getData());
                    lista_rozwozowa.setMagazynier_ID(newLista_rozwozowa.getMagazynier_ID());

                    return lista_rozwozowaRepository.save(lista_rozwozowa);
                })
                .orElseGet(() -> {
                    newLista_rozwozowa.setID(newLista_rozwozowa.getMagazynier_ID());
                    return lista_rozwozowaRepository.save(newLista_rozwozowa);
                });
    }
}

class Lista_rozwozowaNotFoundException extends RuntimeException {
    Lista_rozwozowaNotFoundException(Integer ID) {
        super("404 Lista rozwozowa with id "+ID+" not found");
    }
}

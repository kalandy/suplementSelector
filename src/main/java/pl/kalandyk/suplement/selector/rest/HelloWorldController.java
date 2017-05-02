package pl.kalandyk.suplement.selector.rest;

/**
 * Created by marcinkalandyk on 24.04.2017.
 */
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.kalandyk.suplement.selector.domain.Suplement;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController {



    @RequestMapping(value = "/suplement", method = RequestMethod.GET, produces = "application/json")
    public List<Suplement> getSuplements() {
        ArrayList<Suplement> suplements = new ArrayList<>();

        initSuplements(suplements);

        return suplements;
    }
    @RequestMapping(value = "/suplement/{id}", method = RequestMethod.GET, produces = "application/json")
    public Suplement getSuplement(@PathVariable("id")int id) {

        List<Suplement> suplements = new ArrayList<>();
        initSuplements(suplements);


        System.out.println(id);
        //ArrayList<Suplement> suplements = new ArrayList<>();

        //initSuplements(suplements);

        return suplements.get(id);
    }
    private void initSuplements(List<Suplement> suplements) {
        Suplement suplement1 = new Suplement();
        suplement1.setName("ashwagandha");
        suplement1.setPrice(37d);
        suplement1.setDescription("blablbla");

        Suplement suplement2 = new Suplement();
        suplement2.setName("brahmi");
        suplement2.setPrice(37d);
        suplement2.setDescription("blablbla");

        suplements.add(suplement1);
        suplements.add(suplement2);
    }


}

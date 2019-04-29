package pl.kalandyk.suplement.selector.rest;

/**
 * Created by marcinkalandyk on 24.04.2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kalandyk.suplement.selector.domain.HealthProblem;
import pl.kalandyk.suplement.selector.domain.Suplement;
import pl.kalandyk.suplement.selector.repository.HealthProblemRepository;
import pl.kalandyk.suplement.selector.repository.SuplementRepository;


/*!
* \brief Klasa SuplementSelectorController,klasa implementująca kontroler do używania SpringBoota
*
*  Implementacja kontrolera do używania SpringBoota
*/

@RestController
public class SuplementSelectorController {

    private SuplementRepository suplementRepository; /*!< repozytorium bazy danych - suplementy */
    private HealthProblemRepository healthProblemRepository; /*!< repozytorium bazy danych - problem zdrowotny */

    @Autowired
    public SuplementSelectorController(SuplementRepository suplementRepository,
            HealthProblemRepository healthProblemRepository) {
        this.suplementRepository = suplementRepository;
        this.healthProblemRepository = healthProblemRepository;
    }

    @RequestMapping(value = "/suplements", //adres
            method = RequestMethod.GET, //typ zapytania
            produces = "application/json") // zwracamy JSON'a
    public Iterable<Suplement> getSuplements() {
        return suplementRepository.findAll(); /*!< lista pobierająca suplementy */
    }

    @RequestMapping(value = "/suplements",
            method = RequestMethod.POST,
            produces = "application/json")
    public Suplement addSuplement(@RequestBody Suplement suplement) {
        Suplement save = suplementRepository.save(suplement);
        return save;
    }

    //TODO: dodac metode do usuwanie (method = RequestMethod.DELETE) dla suplementow



    @RequestMapping(value = "/healthProblems",//adres
            method = RequestMethod.GET, /*!< typ zapytania */
            produces = "application/json") // zwracamy JSON'a
    public Iterable<HealthProblem> getAllHealthProblems() { return healthProblemRepository.findAll(); /*!< lista pobierająca problemy zdrowotne */
    }

    //TODO: dodać metode do dodawania (method = RequestMethod.POST) dla healthProblems

    //TODO: dodać metode do usuwania (method = RequestMethod.POST) dla healthProblems
}

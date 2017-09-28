package pl.kalandyk.suplement.selector.rest;

/**
 * Created by marcinkalandyk on 24.04.2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.kalandyk.suplement.selector.domain.HealthProblem;
import pl.kalandyk.suplement.selector.domain.Suplement;
import pl.kalandyk.suplement.selector.repository.HealthProblemRepository;
import pl.kalandyk.suplement.selector.repository.SuplementRepository;

@RestController
public class SuplementSelectorController {

    private SuplementRepository suplementRepository;
    private HealthProblemRepository healthProblemRepository;

    @Autowired
    public SuplementSelectorController(SuplementRepository suplementRepository,
            HealthProblemRepository healthProblemRepository) {
        this.suplementRepository = suplementRepository;
        this.healthProblemRepository = healthProblemRepository;
    }

    @RequestMapping(value = "/suplements", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Suplement> getSuplements() {
        return suplementRepository.findAll();
    }

    @RequestMapping(value = "/healthProblems", method = RequestMethod.GET, produces = "application/json")
    public Iterable<HealthProblem> getAllHealthProblems() {
        return healthProblemRepository.findAll();
    }
}

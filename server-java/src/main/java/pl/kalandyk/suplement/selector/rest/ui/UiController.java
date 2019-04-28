package pl.kalandyk.suplement.selector.rest.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.kalandyk.suplement.selector.domain.HealthProblem;
import pl.kalandyk.suplement.selector.domain.Suplement;
import pl.kalandyk.suplement.selector.domain.User;
import pl.kalandyk.suplement.selector.repository.HealthProblemRepository;
import pl.kalandyk.suplement.selector.repository.SuplementRepository;
import pl.kalandyk.suplement.selector.repository.UserRepository;

import javax.validation.Valid;
import java.util.stream.Collectors;

@Controller
public class UiController {

    private final UserRepository userRepository;
    private final HealthProblemRepository healthProblemRepository;
    private final SuplementRepository suplementRepository;

    public UiController(UserRepository userRepository,
            HealthProblemRepository healthProblemRepository,
            SuplementRepository suplementRepository) {
        this.userRepository = userRepository;
        this.healthProblemRepository = healthProblemRepository;
        this.suplementRepository = suplementRepository;
    }

    @GetMapping("/ui/")
    public String index() {
        return "redirect:/ui/suplements";
    }

    @GetMapping("/ui/contact")
    public String contact(User user) {
        return "contact";
    }

    @GetMapping("/ui/signup")
    public String showSignUpForm(User user) {
        return "add-user";
    }

    @PostMapping("/ui/adduser")
    public String addUser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }

        userRepository.save(user);
        loadDataToModel(model);
        return "suplements";
    }

    @GetMapping("/ui/suplements")
    public String suplements(Model model) {
        loadDataToModel(model);
        return "suplements";
    }

    @GetMapping("/ui/suplements/{id}")
    public String editSuplement(@PathVariable("id") Long id, Model model) {
        model.addAttribute("suplement", suplementRepository.findOne(id));
        return "edit-suplement";
    }

    @PostMapping("/ui/suplements/{id}")
    public String editSuplementPost(@PathVariable("id") Long id, Suplement suplement, Model model) {
        suplement.setId(id);
        suplementRepository.save(suplement);

        return "redirect:/ui/suplements";
    }

    @GetMapping("/ui/health-problems")
    public String healthProblems(Model model) {
        loadDataToModel(model);
        return "health-problems";
    }

    @GetMapping("/ui/health-problems/{id}")
    public String healthProblems(@PathVariable("id") Long id, Model model) {
        HealthProblem healthProblem = healthProblemRepository.findOne(id);
        model.addAttribute("healthProblem", healthProblem);
        model.addAttribute("allSuplements", suplementRepository.findAll());
        model.addAttribute("selectedIds", healthProblem.getSuplements().stream().map(Suplement::getId).collect(
                Collectors.toList()));
        return "edit-health-problem";
    }

    @PostMapping("/ui/health-problems/{id}")
    public String healthProblemsEdit(@PathVariable("id") Long id, HealthProblem healthProblem) {
        healthProblemRepository.save(healthProblem);
        return "redirect:/ui/health-problems";
    }

    private void loadDataToModel(Model model) {
        model.addAttribute("suplements", suplementRepository.findAll());
        model.addAttribute("healthProblems", healthProblemRepository.findAll());
    }
}
package pl.kalandyk.suplement.selector.rest.ui;

import org.springframework.security.crypto.password.PasswordEncoder;
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
import java.util.ArrayList;
import java.util.stream.Collectors;

@Controller
public class UiController {

    private final UserRepository userRepository;
    private final HealthProblemRepository healthProblemRepository;
    private final SuplementRepository suplementRepository;
    private final PasswordEncoder passwordEncoder;

    public UiController(UserRepository userRepository,
            HealthProblemRepository healthProblemRepository,
            SuplementRepository suplementRepository,
            PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.healthProblemRepository = healthProblemRepository;
        this.suplementRepository = suplementRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping({"/ui/", "/"})
    public String index() {
        return "redirect:/ui/suplements";
    }

    @GetMapping("/login")
    public String login() {
        return "my-login";
    }

    @GetMapping("/ui/login-error")
    public String errorLogin() {
        return "my-login";
    }

    @GetMapping("/ui/contact")
    public String contact(User user) {
        return "contact";
    }

    @GetMapping("/ui/signup")
    public String showSignUpForm(User user) {
        return "add-user";
    }

    @PostMapping("/ui/signup")
    public String addUser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("ROLE_USER");
        userRepository.save(user);
        loadDataToModel(model);
        return "redirect:/login";
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

    @GetMapping("/ui/suplements/remove/{id}")
    public String removeSuplement(@PathVariable("id") Long id, Model model) {
        suplementRepository.delete(id);
        return "redirect:/ui/suplements";
    }

    @PostMapping("/ui/suplements/{id}")
    public String editSuplementPost(Suplement suplement, Model model) {
        suplementRepository.save(suplement);

        return "redirect:/ui/suplements";
    }

    @GetMapping("/ui/suplements/new")
    public String newSuplement(Model model) {
        Suplement suplement = new Suplement();
        suplement.setId(0L);
        model.addAttribute("suplement", suplement);

        return "edit-suplement";
    }

    @GetMapping("/ui/health-problems")
    public String healthProblems(Model model) {
        loadDataToModel(model);
        return "health-problems";
    }

    @GetMapping("/ui/health-problems/new")
    public String newHealthProblem(Model model) {
        HealthProblem healthProblem = new HealthProblem();
        healthProblem.setId(0L);
        model.addAttribute("healthProblem", healthProblem);
        model.addAttribute("allSuplements", suplementRepository.findAll());
        model.addAttribute("selectedIds", new ArrayList<>());

        return "edit-health-problem";
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

    @GetMapping("/ui/health-problems/remove/{id}")
    public String removeHealthProblems(@PathVariable("id") Long id, Model model) {
        healthProblemRepository.delete(id);
        return "redirect:/ui/health-problems";
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
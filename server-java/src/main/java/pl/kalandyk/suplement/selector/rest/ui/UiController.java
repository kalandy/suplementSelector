package pl.kalandyk.suplement.selector.rest.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.kalandyk.suplement.selector.domain.User;
import pl.kalandyk.suplement.selector.repository.HealthProblemRepository;
import pl.kalandyk.suplement.selector.repository.SuplementRepository;
import pl.kalandyk.suplement.selector.repository.UserRepository;

import javax.validation.Valid;

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

    private void loadDataToModel(Model model) {
        model.addAttribute("suplements", suplementRepository.findAll());
        model.addAttribute("healthProblems", healthProblemRepository.findAll());
    }

    @GetMapping("/ui/suplements")
    public String suplements(Model model) {
        loadDataToModel(model);
        return "suplements";
    }

    @GetMapping("/ui/health-problems")
    public String healthProblems(Model model) {
        loadDataToModel(model);
        return "health-problems";
    }
}
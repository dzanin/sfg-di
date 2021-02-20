package guru.springframework.sfgdi.controllers;


import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by dz on 18/02/21.
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

// @Autowired not mandatory for constructorInjectedController
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

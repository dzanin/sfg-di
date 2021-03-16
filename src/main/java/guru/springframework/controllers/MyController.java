package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by dz on 17/02/21.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    // No qualifiers here for greetingService, with multiple choise choose the primary
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello ()
    {
        return greetingService.sayGreeting();
    }
}

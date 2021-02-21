package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.ApplicationContext;
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

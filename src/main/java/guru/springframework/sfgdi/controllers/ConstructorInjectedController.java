package guru.springframework.sfgdi.controllers;


import guru.springframework.sfgdi.services.GreetingService;

/**
 * Created by dz on 18/02/21.
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

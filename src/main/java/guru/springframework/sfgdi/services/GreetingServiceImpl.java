package guru.springframework.sfgdi.services;

/**
 * Created by dz on 18/02/21.
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}

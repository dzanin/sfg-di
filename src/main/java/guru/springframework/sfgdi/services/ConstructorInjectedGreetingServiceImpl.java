package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by dz on 18/02/21.
 */
@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}

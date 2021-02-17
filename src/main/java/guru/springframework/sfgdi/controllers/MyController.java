package guru.springframework.sfgdi.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * Created by dz on 17/02/21.
 */
@Controller
public class MyController {

    public String sayHello ()
    {
        System.out.println("Hello World!!");

        return "Hi Folks!";
    }
}

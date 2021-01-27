package guru.springframework.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class SpringContextController {

    public String sayHello() {
        System.out.println("Hello World!");

        return "Welcome to Spring DI....";
    }
}

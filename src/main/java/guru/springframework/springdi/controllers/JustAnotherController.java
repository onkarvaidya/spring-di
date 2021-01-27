package guru.springframework.springdi.controllers;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class JustAnotherController {

    private final GreetingService greetingService;

    public JustAnotherController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.getGreeting();
    }
}

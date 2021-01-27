package guru.otherframework.componentscan;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class OtherFrameworkController {

    private final GreetingService greetingService;

    public OtherFrameworkController(@Qualifier("other-framework") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.getGreeting();
    }
}

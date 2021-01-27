package guru.springframework.springdi.services;

import org.springframework.stereotype.Service;

@Service("other-framework")
public class OtherFrameworkGreetingService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Greeting from other framework - Hello when component scan works!";
    }
}

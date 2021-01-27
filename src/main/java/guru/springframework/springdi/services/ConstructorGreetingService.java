package guru.springframework.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Constructor greets - Hello World!";
    }
}

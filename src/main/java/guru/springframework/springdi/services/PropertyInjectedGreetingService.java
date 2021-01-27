package guru.springframework.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Property Injection greets - Hello World!";
    }
}

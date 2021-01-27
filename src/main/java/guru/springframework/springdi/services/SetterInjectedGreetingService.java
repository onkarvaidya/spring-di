package guru.springframework.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Setter greets - Hello World!";
    }
}

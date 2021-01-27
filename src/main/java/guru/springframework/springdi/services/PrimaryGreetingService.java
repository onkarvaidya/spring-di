package guru.springframework.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Primary Service Greets - Hello World!";
    }
}

package guru.springframework.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("es")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hola Mundo - en español";
    }
}

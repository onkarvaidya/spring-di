package guru.springframework.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"fr"})
@Service("i18nService")
public class I18nFrenchGreetingService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Bonjour le monde - en français";
    }
}

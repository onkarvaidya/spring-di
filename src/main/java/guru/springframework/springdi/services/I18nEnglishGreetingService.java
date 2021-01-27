package guru.springframework.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"en", "default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hello World - in English!";
    }
}

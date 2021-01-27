package guru.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class PropertiesConfig {

    @Value("${guru.springframework.username}")
    private String username;

    @Value("${guru.springframework.password}")
    private String password;

    @Value("${guru.springframework.dburl}")
    private String url;

    private final Environment environment;

    public PropertiesConfig( Environment environment) {
        this.environment = environment;
    }

    @Bean
    public DataSourceProperties dataSourceProperties() {
        DataSourceProperties dataSourceProperties = new DataSourceProperties(username, password, url);
        return dataSourceProperties;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Environment getEnvironment() {
        return environment;
    }
}

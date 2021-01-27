package guru.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("jmsConfiguration")
@Configuration
public class JMSConfiguration {

    @Value("${guru.jms.user}")
    private String username;

    @Value("${guru.jms.queueSize}")
    private String queueSize;

    public String getUsername() {
        return username;
    }

    public String getQueueSize() {
        return queueSize;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setQueueSize(String queueSize) {
        this.queueSize = queueSize;
    }

}

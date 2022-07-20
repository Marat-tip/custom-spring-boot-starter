package kz.halykacademy.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "greetings")
public class GreetingsStarterConfigurationProperties {
    private String phrase = "Hello from greeting controller";
    private Boolean enabled = true;

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}

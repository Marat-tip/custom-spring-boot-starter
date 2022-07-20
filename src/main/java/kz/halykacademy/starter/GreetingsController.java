package kz.halykacademy.starter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingsController {
    private final GreetingsStarterConfigurationProperties properties;

    public GreetingsController(GreetingsStarterConfigurationProperties properties) {
        this.properties = properties;
    }

    @GetMapping
    public String sayHello() {
        return properties.getPhrase();
    }
}

package kz.halykacademy.starter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@EnableConfigurationProperties(GreetingsStarterConfigurationProperties.class)
@Import(GreetingsController.class)
public class GreetingsStarterAutoConfiguration {
}

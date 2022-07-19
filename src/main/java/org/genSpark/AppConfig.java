package org.genSpark;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



// THIS CLASS CONTAINS THE BEAN CONFIGURATIONS
@Configuration
@ComponentScan(basePackages = "org.genSpark")
public class AppConfig {

    @Bean
    public Samsung getSamsung()
    {
       return new Samsung();
    }
    @Bean
    public Apple getApple()
    {
        return new Apple();
    }




}

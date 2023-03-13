package Config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyWebConfig {
    @Bean
    public RestTemplate REST11TEMPLATE(){
        System.out.println("Hi there");
        return new RestTemplate();
    }

  //  public String KFF(){
       // return  "Hello";
    }


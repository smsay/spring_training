package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class NewAppConfig {

    @Bean
    //@Primary
    public String str1(){
        return "Welcome to Cydeo";
    }

    @Bean
    public String str2(){
        return "Spring Vore Practice";
    }
}

package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class,NewAppConfig.class);

        FullTimeEmployee fullTimeEMployee = container.getBean(FullTimeEmployee.class);
        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);

        fullTimeEMployee.createAccount();
        partTimeEmployee.createAccount();

        String str1=container.getBean("str1",String.class);
        System.out.println(str1);

        String str2=container.getBean("str2",String.class);
        System.out.println(str2);
    }
}

package org.genSpark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Phone s7 = (Samsung) context.getBean(Samsung.class) ;
        Phone iphone13 = (Apple) context.getBean(Apple.class) ;

        s7.config();
        iphone13.config();

    }
}

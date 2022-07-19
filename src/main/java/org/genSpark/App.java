package org.genSpark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Customer c = (Customer) context.getBean(Customer.class);



        // SIMULATE CUSTOMER PURCHASE
        for (int x = 0; x < 20; x++) {
            c.spend();
        }
        c.log();




    }
}

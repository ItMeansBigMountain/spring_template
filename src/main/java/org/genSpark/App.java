package org.genSpark;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Student student_1 = (Student) context.getBean("Student");


        System.out.println(student_1.getName());
        System.out.println(student_1.getId());
        System.out.println(student_1.getAddress());
        System.out.println(student_1.getPh());



        context.close();



    }


}

package org.genSpark;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect
@Component
@EnableAspectJAutoProxy
public class Helper {

    //ALL CROSS CUTTING CONCERNS HERE

    @Before("execution(public void show())")
    public void log() {
        System.out.println("Log opened");
    }


    @After("execution(public void show())")
    public void logClose() {
        System.out.println("Log closed");
    }


}

package pers.wdj.spring_in_action.aop;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* pers.wdj.spring_in_action.aop.Performance.perform(..))")
    public void performance() {}

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

}

package com.spinginaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");

//        Performer performerDuke = (Performer) context.getBean("duke", Performer.class);
//        performerDuke.perform();
//
        Performer performerKenny = context.getBean("kenny", Performer.class);
        performerKenny.perform();

//        Performer knifeJuggler = (Performer) context.getBean("knifeJuggler", Performer.class);
//        knifeJuggler.perform();

        Performer performerHank = (Performer) context.getBean("hank", Performer.class);
        performerHank.perform();

//        Performer performerCarl = (Performer) context.getBean("carl", Performer.class);
//        performerCarl.perform();

    }
}

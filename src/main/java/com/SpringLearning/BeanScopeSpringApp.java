package com.SpringLearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeSpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
        AthleticsCoach coach1 = context.getBean("myCoach", AthleticsCoach.class);
        AthleticsCoach coach2 = context.getBean("myCoach", AthleticsCoach.class);

        System.out.println(coach1 == coach2);

        context.close();

    }
}

package com.SpringLearning.Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

        // If there is no bean ID - then the class name with 1st character in small - is default bean ID

        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.advice());
        System.out.println(coach.fortuneAdvice());

        context.close();

    }
}

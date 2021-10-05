package com.SpringLearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("myCoach", Coach.class);
        System.out.println(coach.advice());
        System.out.println(coach.getFortune());
        System.out.println(coach.getDietAdvice());
        System.out.println(coach.getKit());
        context.close();

    }
}

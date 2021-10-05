package com.SpringLearning.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // If there is no bean ID - then the class name with 1st character in small - is default bean ID

        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.advice());

        context.close();

    }
}

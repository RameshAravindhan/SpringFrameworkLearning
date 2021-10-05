package com.SpringLearning.Annotations;

import org.springframework.stereotype.Component;

@Component("myCoach1")
public class AthleticsCoach implements Coach {



    String bat;
    String ball;

    public String getBat() {
        return bat;
    }

    public void setBat(String bat) {
        this.bat = bat;
    }

    public String getBall() {
        return ball;
    }

    public void setBall(String ball) {
        this.ball = ball;
    }




    public AthleticsCoach() {
    }

   @Override
    public String advice() {
        return "Run Daily";
    }



    private void initMethod() {
        System.out.println("Init Method Working");
    }

    private void destroyMethod() {
        System.out.println("Destroy Method Working");
    }
}

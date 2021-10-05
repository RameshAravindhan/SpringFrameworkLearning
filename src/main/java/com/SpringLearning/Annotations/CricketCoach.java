package com.SpringLearning.Annotations;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class CricketCoach implements Coach {


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

    public CricketCoach() {
    }





    @Override
    public String advice() {
        return "Bat Daily";
    }




  }

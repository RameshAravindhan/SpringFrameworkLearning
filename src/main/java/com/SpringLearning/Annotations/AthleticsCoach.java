package com.SpringLearning.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCoach1")
public class AthleticsCoach implements Coach {


    FortuneService fortuneService;
    @Value("${foo.bat}")
    String bat;

    @Value("${foo.ball}")
    String ball;

//    @Autowired
//    public AthleticsCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    public FortuneService getFortuneService() {
        return fortuneService;
    }

    @Autowired
    @Qualifier("goodFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

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
        return "Use Bat" + getBat();
    }

    @Override
    public String fortuneAdvice() {
        return fortuneService.fortune();
    }


    private void initMethod() {
        System.out.println("Init Method Working");
    }

    private void destroyMethod() {
        System.out.println("Destroy Method Working");
    }
}

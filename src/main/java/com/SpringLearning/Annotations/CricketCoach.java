package com.SpringLearning.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myCoach")
@Scope("singleton")
public class CricketCoach implements Coach {


    @Value("${foo.bat}")
    String bat;

    @Value("${foo.ball}")
    String ball;


    FortuneService fortuneService;

//    @Autowired
//    public CricketCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

// Can be Autowired using Constructor/ Setter/ Any Method / Directly on the field

    @Autowired
    @Qualifier("goodFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
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

    public CricketCoach() {
    }


    @Override
    public String advice() {
        return "Use Ball" + getBall();
    }

    @Override
    public String fortuneAdvice() {
        return fortuneService.fortune();
    }

    @PostConstruct
    public void postconstructMethood() {
        System.out.println("Post Construct Method");
    }

    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("Pre Destroy Method");
    }

}

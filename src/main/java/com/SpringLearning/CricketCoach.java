package com.SpringLearning;

public class CricketCoach implements Coach {
    Diet diet;
    FortuneService fortuneService;
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

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;

    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    @Override
    public String advice() {
        return "Bat Daily";
    }

    public String getFortune() {
        return fortuneService.fortune();
    }

    @Override
    public String getDietAdvice() {
        return diet.getDiet();
    }

    @Override
    public String getKit() {
        return "Preferred Ball is " + getBall() + " Preferred Bat is " + getBat();
    }
}

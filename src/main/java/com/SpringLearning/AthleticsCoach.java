package com.SpringLearning;

public class AthleticsCoach implements Coach {

    FortuneService fortuneService;
    Diet diet;
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

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }


    public AthleticsCoach() {
    }

    public AthleticsCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String advice() {
        return "Run Daily";
    }

    @Override
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


    private void initMethod() {
        System.out.println("Init Method Working");
    }

    private void destroyMethod() {
        System.out.println("Destroy Method Working");
    }
}

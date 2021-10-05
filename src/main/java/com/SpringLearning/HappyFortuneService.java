package com.SpringLearning;

public class HappyFortuneService implements FortuneService{
    @Override
    public String fortune() {
        return "Today is a good day";
    }
}

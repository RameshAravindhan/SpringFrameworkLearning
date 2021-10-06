package com.SpringLearning.Annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String fortune() {
        return "Happy Fortune Class";
    }
}

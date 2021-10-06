package com.SpringLearning.Annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

 @Component
public class GoodFortuneService implements FortuneService {
    @Override
    public String fortune() {
        return "Good Fortune Class";
    }
}

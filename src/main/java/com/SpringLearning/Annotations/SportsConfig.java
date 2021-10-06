package com.SpringLearning.Annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.SpringLearning.Annotations")
@PropertySource("classpath:Sports.properties")
public class SportsConfig {
}

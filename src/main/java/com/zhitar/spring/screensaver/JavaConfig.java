package com.zhitar.spring.screensaver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = "com.zhitar.spring.screensaver")
public class JavaConfig {

    @Bean
    @Scope(value = "periodical")
    public Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public ColorFrame colorFrame() {
        return new ColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        while (true) {
            context.getBean(ColorFrame.class).showOnRandomPlace();
            Thread.sleep(500);
        }
    }
}

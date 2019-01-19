package com.zhitar.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        while (true) {
//            Thread.sleep(500);
            Quoter quoter = context.getBean(Quoter.class);
        context.getBean(Quoter.class).sayQuote();
//            quoter.sayQuote();
//        }
    }
}

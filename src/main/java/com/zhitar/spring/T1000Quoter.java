package com.zhitar.spring;

public class T1000Quoter extends TerminatorQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("I'm liquid!");
    }
}

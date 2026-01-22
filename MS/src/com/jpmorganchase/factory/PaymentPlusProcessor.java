package com.jpmorganchase.factory;

public class PaymentPlusProcessor implements Processor{
    @Override
    public void process() {
        System.out.println("PaymentPlusProcessor");
    }
}

package com.jpmorganchase;

public class ProcessorImpl implements Processor{

    public void process(Object obj) {
        System.out.println("obj");
    }
    public void process(String str) {
        System.out.println("str");
    }
    public void process(Integer inObj) {
        System.out.println("inObj");
    }
}

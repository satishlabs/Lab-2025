package com.jpmorganchase.factory;

public class ProcessorFactory {
    Processor processor;
    public Processor getProcessor(String str){
        if(str.equals("P+")){
            return new PaymentPlusProcessor();
        }else if (str.equals("phub")){
            return new PHubProcessor();
        }else if(str.equals("dgs")){
            return new DgsProcessor();
        }else{
            System.out.println("Invalid");
        }
        return null;
    }
}

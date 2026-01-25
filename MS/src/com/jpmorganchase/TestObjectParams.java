package com.jpmorganchase;

public class TestObjectParams {

    static void main() {
        Processor processor = new ProcessorImpl();
       processor.process(null);  //obj
        Integer a = 10;
        processor.process(a);

        String str = "";
        processor.process(str);
    }
}

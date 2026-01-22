package com.jpmorganchase.factory;

public class MainProcessor {
    static void main() {
        ProcessorFactory processorFactory = new ProcessorFactory();
        Processor pPlusProcessor = processorFactory.getProcessor("P+");
        pPlusProcessor.process();
    }
}

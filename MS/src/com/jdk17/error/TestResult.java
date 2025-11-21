package com.jdk17.error;

public class TestResult {
    static void hanlde(Result r){
        switch (r){
            case Success s -> System.out.println("Ok ->"+s.message());
            case Failure f -> System.out.println("ERROR ->"+f.error());
        }
    }
    static void main() {
        hanlde(new Success("Data saved"));
        hanlde(new Failure("Invalid Request"));
    }
}

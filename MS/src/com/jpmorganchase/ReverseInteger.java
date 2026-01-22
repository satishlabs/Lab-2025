package com.jpmorganchase;

public class ReverseInteger {
    static void main() {
        int n = 12345;
        int r=0, rev=0;
        while(n >0){
            r = n%10;
            n = n/10;

            rev = rev*10+r;
        }
        System.out.println(rev);
    }
}

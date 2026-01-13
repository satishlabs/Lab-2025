package com.coforge;

import java.util.Scanner;

public class PrintByN {
    static void main() {
        int[] a  ={10,15,20,25};
        Scanner sc = new Scanner(System.in);;
        System.out.println("Enter n ");
        int n = sc.nextInt();
        int startIndex = (n-1)*2;

        for(int i=startIndex; i<startIndex+2 && i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}

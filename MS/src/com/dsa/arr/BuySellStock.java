package com.dsa.arr;

public class BuySellStock {
    static void main() {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit=0;
        for(int price : prices){
            min = Math.min(min,price);
            profit = Math.max(profit, price-min);
        }
        return profit;
    }
}

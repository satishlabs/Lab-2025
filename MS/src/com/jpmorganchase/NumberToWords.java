package com.jpmorganchase;

public class NumberToWords {
    static String[] ones = {
            "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
    };
    static String[] teens = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    static void main() {
        int number = 2221;
        System.out.println(convert(number));
    }

    private static String convert(int num) {
        String result = "";
        if(num >= 1000){
            result += ones[num/1000]+" Thousand ";
            num %= 1000;
        }

        if(num >= 100){
            result += ones[num/100]+" Hundred ";
            num %= 100;
        }

        if(num >= 20){
            result += tens[num/10]+" ";
            num %= 10;
        }else if(num >= 10){
            result += teens[num-10]+" ";
            return result.trim();
        }

        if(num > 0){
            result += ones[num];
        }
        return result.trim();
    }
}

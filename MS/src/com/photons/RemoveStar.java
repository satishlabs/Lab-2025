package com.photons;

public class RemoveStar {
    static void main() {
        String str = "sat**ish**";
        System.out.println(removeStars(str));
    }

    private static String removeStars(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c: str.toCharArray()){
            if(c=='*'){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

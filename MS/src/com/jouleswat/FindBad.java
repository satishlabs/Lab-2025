package com.jouleswat;

public class FindBad {
    public static void main() {
        int n = 6;
        int bad=4;
        System.out.println(findBadVersion(n, bad));
    }

    private static int findBadVersion(int n, int bad) {
        int left  = 1;
        int right = n;
        while(left < right){
            int mid = left+(right-left)/2;
            if(isBadVersion(mid, bad)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    private static boolean isBadVersion(int mid, int bad) {
        return mid >= bad;
    }
}

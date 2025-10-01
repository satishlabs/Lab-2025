package com.alti;

import java.util.Arrays;
/*
🔟 Minimum railway platforms
 Hint: Sort arrivals & departures → iterate with two pointers, track platforms in use.
Approach (with your hint)

Sort arrival and departure arrays separately.

Use two pointers (i for arrivals, j for departures).

Traverse:

If arrival[i] <= departure[j], we need a new platform → platforms++, move i.

Else (a train has left), free one platform → platforms--, move j.

Track the maximum platforms used at any time.
* */
public class MinPlatforms {
    public static void main(String[] args) {
        int[] arrivals = {900, 940, 950, 1100, 1500, 1800};
        int[] departures = {910, 1200, 1120, 1130, 1900, 2000};
        int result = findMinPlatforms(arrivals, departures);
        System.out.println("Minimum platforms needed: "+result);
    }

    private static int findMinPlatforms(int[] arrivals, int[] departures) {
        Arrays.sort(arrivals);
        Arrays.sort(departures);
        int n = arrivals.length;
        int i=0, j=0;
        int platforms = 0, maxPlatforms = 0;
        while(i<n && j<n){
            if(arrivals[i] < departures[j]){
                platforms++; //new train arrives
                i++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
            }else{
                platforms--; //train departs
                j++;
            }
        }
        return maxPlatforms;
    }
}

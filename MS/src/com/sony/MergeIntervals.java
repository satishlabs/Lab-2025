package com.sony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    static void main() {
       int[][] intervals = {{1,3},{2,6},{8,10},{15,17}};
        int[][] result = mereg(intervals);
        for(int[] num : result){
            System.out.println(Arrays.toString(num));
        }
    }

    private static int[][] mereg(int[][] intervals) {
        int[] prev = intervals[0]; //{1,3}
        List<int[]> result = new ArrayList<>();

        for(int i=1; i<intervals.length; i++){
            int[] curr = intervals[i]; //{1,3}

            if(curr[0] <= prev[1]){
               prev[1] = Math.max(prev[1],curr[1]);
            }else{
                result.add(prev);
                prev = curr;
            }
        }
        result.add(prev);
        return result.toArray(new int[result.size()][]);
    }
}

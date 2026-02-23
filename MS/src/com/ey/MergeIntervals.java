package com.ey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
        int[][] merged = mergeIntervals(intervals);
        for(int[] in : merged){
            System.out.println(Arrays.toString(in));
        }
    }

    private static int[][] mergeIntervals(int[][] intervals) {

        // Step 1: sort by start time
       // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);

        for(int i=1; i<intervals.length; i++){
            int[] next = intervals[i];

            if(next[0] <= current[1]){
                current[1] = Math.max(current[1], next[1]);
            }else{
                current = next;
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}

package com.nagaaro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    static void main(String[] args) {
        int[][] intervals = {
                {1,3}, {2,6}, {8,10}, {15,17}
        };
        int[][] result = mergeIntervals(intervals);
        for(int[] arr : result){
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        // Step 1: sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        int[] prev = intervals[0];

        // Step 2: merge
        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];

            if (curr[0] <= prev[1]) {
                // overlap → merge
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                // no overlap → add previous
                merged.add(prev);
                prev = curr;
            }
        }

        merged.add(prev);

        return merged.toArray(new int[merged.size()][]);
    }
}

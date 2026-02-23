package com.sony;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval{
    int start, end;
    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "[" + start + "," + end + "]";
    }
}

public class MergeInterval {
    static void main() {
        List<Interval> intervals = new ArrayList<>();
       /* intervals.add(new Interval(1,3));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(15,18));*/
        intervals.add(new Interval(1,2));
        intervals.add(new Interval(3,4));
        intervals.add(new Interval(5,8));
        intervals.add(new Interval(10,12));
        intervals.add(new Interval(11,20));
        List<Interval> merged = merge(intervals);
        for(Interval i: merged){
            System.out.println(i);
        }
    }

    private static List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.size() == 0)
            return new ArrayList<>();

        //step1: Sort Intervals using Comparator
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        List<Interval> result = new ArrayList<>();
        Interval prev = intervals.get(0);

        //step2: Traverse and merge
        for(int i=1; i<intervals.size(); i++){
            Interval curr = intervals.get(i);

            if(curr.start <= prev.end){
                prev.end = Math.max(prev.end, curr.end);
            }else{
                result.add(prev);
                prev = curr;
            }
        }
        result.add(prev);
        return result;
    }
}

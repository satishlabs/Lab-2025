package com.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortExample {
    static void main() {
        List<Integer> list = Arrays.asList(38, 27, 43, 3, 9, 82, 10);
        List<Integer> sortedList = mergeSort(list);

        System.out.println("Sorted List: "+sortedList);
    }

    private static List<Integer> mergeSort(List<Integer> list) {
        if(list.size() <= 1){
            return list;
        }
        int mid = list.size()/2;
        List<Integer> left = mergeSort(list.subList(0,mid));
        List<Integer> right = mergeSort(list.subList(mid, list.size()));

        return merge(left, right);
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i=0, j=0;

        while(i< left.size() && j <  right.size()){
            if(left.get(i) <= right.get(j)){
                result.add(left.get(i));
                i++;
            }else{
                result.add(right.get(j));
                j++;
            }
        }

        //Add remaining elements
        while(i < left.size()){
            result.add(left.get(i));
            i++;
        }

        while(j < right.size()){
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}

package accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateWithoutUsingSet {
    static void main() {
        List<Integer> list = Arrays.asList(1,2,3,2,4,3,5);

        List<Integer> uniqueList = new ArrayList<>();
        for(Integer num : list){
            if(!uniqueList.contains(num)){
                uniqueList.add(num);
            }
        }
        System.out.println(uniqueList);

        System.out.println("\n=======================");
     List<Integer> res =   list.stream()
                .distinct()
                .toList();
        System.out.println(res);
        System.out.println("\n=======================");
        List<Integer> sortedList = new ArrayList<>();
        Collections.sort(sortedList);

        List<Integer> unList = new ArrayList<>();
        Integer prev = null;
        for(Integer num : sortedList){
            if(!num.equals(prev)){
                unList.add(num);
                prev = num;
            }
        }
        System.out.println(sortedList);
        System.out.println("\n=======================");
        for(int i=0; i<list.size(); i++){
            if(list.indexOf(list.get(i)) == 1){
                unList.add(list.get(i));
            }
        }
        System.out.println(unList);
    }
}

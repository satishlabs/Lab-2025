package liftlab;

import java.util.ArrayList;
import java.util.List;

public class FindAllCombinationOfTarget {
    static void main() {
        List<Integer> list = List.of(1,2,3);
        int target=4;
        List<List<Integer>> result = new ArrayList<>();
        findCombination(list,target,0, new ArrayList<>(), result);
        System.out.println(result);
    }

    public static void findCombination(List<Integer> list, int target,
                                       int start,
                                       List<Integer> current,
                                       List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = start; i < list.size(); i++){

            int num = list.get(i);

            if(num > target) continue;

            current.add(num);

            findCombination(list, target - num, i, current, result);

            current.remove(current.size() - 1);
        }
    }
}

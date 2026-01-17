package fb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    static void main() {

        int[] arr = {3, 2, 1, 2, 3, 2};
        System.out.println("t1 "+findMajorityElement(arr));
        System.out.println("\n======================");
        System.out.println("t2 "+findMajorityElement1(arr));
        System.out.println("\n======================");
        System.out.println("t3 "+findMajorityElement2(arr));

    }

    private static int findMajorityElement2(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    private static int findMajorityElement1(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num) > arr.length/2){
                return num;
            }
        }
    return -1;
    }

    private static int findMajorityElement(int[] arr) {
        Arrays.sort(arr);
        int candidate=0;
        int count = 0;

        for(int num : arr){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1: -1;
        }
        return candidate;
    }

}

package JavaPracticeprograms;

import java.util.HashMap;

//public class SumMultiplierCheck {
//    public static void main(String[] args) {
//        int[] arr = {2, 2, 2, 2, 4, 1};
//        int[] arr1={1,1,2,10,3,1,12};
//        System.out.println(isSumMultiplier(arr));
//    }
//
//    public static boolean isSumMultiplier(int[] arr) {
//        int sum = 0;
//        HashMap<Integer, Integer> freqMap = new HashMap<>();
//
//        for (int num : arr) {
//            sum += num;
//            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
//        }
//
//        for (int num : freqMap.keySet()) {
//            if (num * freqMap.get(num) == sum) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//}
public class SumMultiplierCheck {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 10, 3, 1, 12};
        System.out.println(hasSumMultiplier(arr));
    }

    public static boolean hasSumMultiplier(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] == sum) {
                    return true;
                }
            }
        }

        return false;
    }
}

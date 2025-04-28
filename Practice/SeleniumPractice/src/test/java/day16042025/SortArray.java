package day16042025;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5,7,9, 2, 8, 1, 3};
        
       Arrays.sort(arr);
       System.out.print("Elements of array sorted in ascending order: ");
       for(int num : arr)
    	   
       System.out.print(+num+ " ");
       
//       System.out.println("Elements of array sorted in ascending order: ");
//       for(int i=0; i<=arr.length-1; i++) {
//    	   System.out.println(arr[i]);
//       }
       
       

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    // swap
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        System.out.println("Sorted Array: ");
//        for (int num : arr) System.out.print(num + " ");
    }
}


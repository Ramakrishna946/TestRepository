package day16042025;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream;

public class SortArray {
    public static void main(String[] args) {
    	
        int[] arr = {5,7,9, 2,2,8,5, 8, 1, 3};
        IntStream numbers=Arrays.stream(arr);
        numbers.sorted().distinct().forEach((s->System.out.println(s)));
        
       Arrays.sort(arr);
       System.out.print("Elements of array sorted in ascending order: ");
       for(int num : arr)
    	   
       System.out.print(+num+ " ");
       
       System.out.println("\n Elements of array sorted in decending order: ");
       for(int i=arr.length-1; i>=0; i--) {
    	   System.out.println(arr[i]);
       }
       
    }
}


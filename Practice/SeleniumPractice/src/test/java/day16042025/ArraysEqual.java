package day16042025;

import java.util.Arrays;

public class ArraysEqual {
	public static void main(String[] args) {
        int[] arr1 = {6,2, 4, 5,3, 1};
        int[] arr2 = {1,3,6, 4, 5, 2};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean result = Arrays.equals(arr1, arr2);
        System.out.println("Arrays are equal: " + result);
        
        if(Arrays.equals(arr1, arr2)) {
        	System.out.println("the given arrys  are equal");
        }else {
        	System.out.println("the given arrys  are not  equal");
        }
        
        
    }

}

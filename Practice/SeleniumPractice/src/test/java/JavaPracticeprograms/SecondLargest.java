package JavaPracticeprograms;

import java.util.Arrays;

public class SecondLargest {
	
    public static void main(String[] args) {
        int[] arr = {12, 35, 14, 10, 34, 1,23,17,26};
        int n=6;
        int size=arr.length;
        if(n<=size ) {
        Arrays.sort(arr);  // Sort the array in ascending order
        int nthLargest = arr[size - n];  // Get the nth largest
        System.out.println("The " + n + "-th largest number is: " + nthLargest);

        
        }else {
        	System.out.println("Invalid input: n should be between 1 and " + size);
        }
    }
    }



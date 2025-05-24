package JavaPracticeprograms;

import java.util.Arrays;
import java.util.Collections;

public class Javasortingorder {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5,7,3,9,6,9,3,2,9, 2, 4, 6};
        int n = arr.length;
        int mid = n / 2;

        // Sort first half in ascending order
        Arrays.sort(arr, 0, mid);

        // Sort second half in descending order
        Arrays.sort(arr, mid, n, Collections.reverseOrder());

        // Print the result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


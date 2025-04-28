package day16042025;

public class MinMaxArray {
	public static void main(String[] args) {
        int[] arr = {12, 4, 7, 19, 2, 33, 5};
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

}

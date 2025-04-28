package day16042025;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 2, 3, 7, 8 };
		
		Set<Integer> set = new LinkedHashSet<>();

		for (int num : arr) {
			set.add(num);
		}

		System.out.println("Array after removing duplicates: " + set);

		
	}
}

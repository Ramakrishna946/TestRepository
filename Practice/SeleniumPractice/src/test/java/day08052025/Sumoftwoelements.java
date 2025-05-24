package day08052025;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sumoftwoelements {
	static int sum;
//
	public static void main(String[] args) {
//
		int[] a = { 2, 4, 3, 1, 6, 7, 8, 10 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				sum = a[i] + a[j];
				if (sum == 10) {
					System.out.println(a[i] + "," + a[j]);
				}
			}
		}

	
	//public static void main(String[] args) {
		
		int[] a1 = { 2, 4, 3, 1, 6, 7, 8, 10 };
		int max=a1[0];
		int min=a1[0];
		for(int num : a1) {
			if(num>max)max=num;
			if(num<min)min=num;
		}
		System.out.println("The maximum number is :" +max);
		System.out.println("The minimum number is :" +min);
	}
	
	
}

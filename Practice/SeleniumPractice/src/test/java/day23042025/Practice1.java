package day23042025;

import java.util.Scanner;
import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		int num=76474;
		int original1=num;
		int reverse=0;
		while(num!=0) {
			int digit=num %10;
			reverse=reverse * 10 + digit;
			num=num / 10;
			
		}
		System.out.println(reverse);
		
		
		if ( original1 == reverse) {
            System.out.println(original1 + " is a palindrome.");
        } else {
            System.out.println(original1 + " is not a palindrome.");
        }
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int original = scanner.nextInt();
	        int number = original;
	        int reversed = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number = number / 10;
	        }

	        if (original == reversed) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }

	        scanner.close();
}
}
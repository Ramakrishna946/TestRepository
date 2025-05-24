package JavaPracticeprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the any value of Number : ");
		int num=scn.nextInt();
		int original=num;
		int reverse=0;
		
	while(num!=0) {
		reverse=reverse*10 + num%10;
		num=num/10;
		
	}
	System.out.println(" the reverse of the number is :" +reverse);
	if(reverse==original) {
		System.out.println("The given Number is Palindrome : " +reverse);
	}else {
		System.out.println("The given Number is Not Palindrome : " +reverse);
	}
	}

}

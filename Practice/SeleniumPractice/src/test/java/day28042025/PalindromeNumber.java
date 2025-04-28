package day28042025;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, original = num, reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num=num/10;
        }

        if (original == reversed)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}


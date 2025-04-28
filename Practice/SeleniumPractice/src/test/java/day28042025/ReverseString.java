package day28042025;

public class ReverseString {
    public static void main(String[] args) {
        String original = "madam";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
        if(reversed.equals(original)) {
        	System.out.println("the string is palindrome");
        }else {
        	System.out.println("the string is not palindrome");
        }
    }
    
}


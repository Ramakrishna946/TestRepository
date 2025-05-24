package day08052025;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

	    public static void main(String[] args) {
	        String str = "apple,banana,orange";
	        char[] chars=str.toCharArray();
	        System.out.println(chars);
	        for(char chr : chars) {
	        	System.out.println(chr);
	        }
	        
	        
	        
	        // Convert string to string array using split
	        String[] fruits = str.split(",");
	        ArrayList<String> frulist= new ArrayList<>(Arrays.asList(fruits));
	        System.out.println(frulist);
	        
	        // Print the array
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }
	}



package day16042025;

public class DuplicateChars {

	
	    public static void main(String[] args) {
	        String input = "ramakrishna chintha thangella marripudi";
	        String aftremovespaces=input.replace(" ", "");
	        
	        System.out.println("the string after remove the spaces :" +aftremovespaces);
	        char[] chars = aftremovespaces.toCharArray();
	        boolean[] visited = new boolean[chars.length];

	        System.out.println("Duplicate characters in the string:");

	        for (int i = 0; i < chars.length; i++) {
	            if (visited[i]) continue;

	            int count = 1;
	            for (int j = i + 1; j < chars.length; j++) {
	                if (chars[i] == chars[j]) {
	                    count++;
	                    visited[j] = true;
	                }
	            }

	            if (count >  1) {
	                System.out.println(chars[i] + " - " + count + " times");
	            }
	        }
	    }
	}

	


package JavaPracticeprograms;

	public class ExtractNumbers {
	    public static void main(String[] args) {
	        String input = "sfsg5454gre353ft4rfe535grt53tget35";
//	        StringBuilder numbers = new StringBuilder();
//
//	        for (char ch : input.toCharArray()) {
//	            if (Character.isDigit(ch)) {
//	                numbers.append(ch);
//	            }
//	        }
//
//	        System.out.println("Extracted numbers are : " + numbers.toString());
	    	String numbers1=input.replaceAll("[^0-9]", "");
	    	System.out.println("Extracted Numbers are : " +numbers1);
	    }
	}



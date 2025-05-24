package JavaPracticeprograms;



	public class DoubledEachCharacters {
		
	    public static void main(String[] args) {
	        String input = "Ramakrishna";
	        String output = doubleCharacters(input);
	        
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
	        StringBuilder str=new StringBuilder(output);
	        str.reverse();
	        System.out.println(str);
	    }

	    public static String doubleCharacters(String str) {
	        StringBuilder doubled = new StringBuilder();
	        for (char ch : str.toCharArray()) {
	            doubled.append(ch).append(ch); // Append character twice
	        }
	        return doubled.toString();
	    }
	}




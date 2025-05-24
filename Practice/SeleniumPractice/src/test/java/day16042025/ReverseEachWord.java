package day16042025;

public class ReverseEachWord {
	public static void main(String[] args) {
        String sentence = "You ARe Welcome Ramakrishna Chintha";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        result.reverse();
        System.out.println(result);
        int vowels=0;
        int consonents=0;
        String str=sentence.toLowerCase();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        for(char ch : str.toCharArray()) {
        	if(ch>='a' && ch<='z') {
        		if("aeiou".indexOf(ch)!=-1) {
        			 vowels++;
        			
        			
        		}else {
        			consonents++;
        		}
        		
        	}
        	
        }

        System.out.println("Reversed words: " + result.toString().trim());
        System.out.println(" the total vowels are : " +vowels);
        System.out.println(" the total consonents are : " +consonents);
    	
    }

}

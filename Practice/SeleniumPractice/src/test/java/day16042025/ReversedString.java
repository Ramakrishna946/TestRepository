package day16042025;

public class ReversedString {

	public static void main(String[] args) {
		String S1="RamakrishnaChintha";
		String reverse="";
		String reversed = new StringBuilder(S1).reverse().toString();
		System.out.println("the reverse of the string given is :" +reversed);
		
		for(int i=S1.length()-1; i>=0; i--) {
			
			reverse+=S1.charAt(i);
				
		}
		System.out.println("the reverse of the given String is  :" +reverse);
		if(reverse.equals(S1)) {
			System.out.println("the given String is palaendrome :" +reverse);
		}else {
			System.out.println("the given String is not palaendrome :" +reverse);
		}
		
	}

}

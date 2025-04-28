package day23042025;

public class Practice2 {

	public static void main(String args[]) {
		String s = "Sharma is a good player and he is so punctual";
		System.out.println(s.length());
		String words[] = s.split(" ");
		System.out.println("The Number of words present in the string are : " + words.length);

		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(s);
		sb1.reverse();
		System.out.println(sb1);

		for (String word : words) {
			sb.append(new StringBuilder(word).reverse()).append(" ");

		}
		System.out.print(sb.toString().trim());

	}

}

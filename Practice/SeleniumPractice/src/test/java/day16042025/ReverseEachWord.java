package day16042025;

public class ReverseEachWord {
	public static void main(String[] args) {
        String sentence = "You ARe Welcome Ramakrishna Chintha";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        result.reverse();
        System.out.println(result);

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println("Reversed words: " + result.toString().trim());
    }

}

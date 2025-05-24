package day16042025;

public class VowelConsonantCount {
	public static void main(String[] args) {
        String str = "Ramakrishna";
        str = str.toLowerCase();
        str=str.toUpperCase();
        int vowels = 0, consonants = 0;

        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                if ("AEIOU".indexOf(ch) != -1) {
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

}

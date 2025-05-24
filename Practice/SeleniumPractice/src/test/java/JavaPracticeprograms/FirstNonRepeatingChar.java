package JavaPracticeprograms;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "dfrrddgrfswfwgwggerwwfwgwesh";
        int[] freq = new int[256]; // ASCII characters

        // First pass: Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        // Second pass: Find first character with frequency 1
        for (int i = 0; i < input.length(); i++) {
            if (freq[input.charAt(i)] == 1) {
                System.out.println("First non-repeating character: " + input.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}


package JavaPracticeprograms;

public class StringReduction {
    public static void main(String[] args) {
        String input = "ababab"; // Change this to "abcabc" to test that case
        int count = 0;

        // Find the smallest repeating pattern
        String pattern = "";
        for (int i = 1; i <= input.length(); i++) {
            pattern = input.substring(0, i);
            StringBuilder sb = new StringBuilder();

            while (sb.length() < input.length()) {
                sb.append(pattern);
            }

            if (sb.toString().equals(input)) {
                break;
            }
        }

        // Count how many times the pattern fits
        count = input.length() / pattern.length();
        System.out.println(count);
    }
}


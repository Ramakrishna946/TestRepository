package JavaPracticeprograms;

public class StringReducer {
    public static void main(String[] args) {
        String input = "aaabccdddhhjjfggbgffjhhd";
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1); // remove pair
            } else {
                sb.append(c);
            }
        }

        String result = sb.length() == 0 ? "Empty String" : sb.toString();
        System.out.println(result); // Output: abd
    }
}

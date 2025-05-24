package day16042025;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {

    public static void main(String[] args) {
        String input = "ramakrishna chintha thangella marripudi";
        String afterRemoveSpaces = input.replace(" ", "").toUpperCase(); // Remove spaces and convert to uppercase

        System.out.println("The string after removing spaces: " + afterRemoveSpaces);

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : afterRemoveSpaces.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}

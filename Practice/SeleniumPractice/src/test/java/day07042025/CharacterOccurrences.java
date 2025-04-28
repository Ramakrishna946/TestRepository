package day07042025;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//public class CharacterOccurances {
//
//	static int Occurances(String str, String word) {
//
//		List<String> wordList = Arrays.asList(str.split("\\s+"));
//		return Collections.frequency(wordList, word);
//	}
//
//	public static void main(String[] args) {
//		String str = "Reshma Raghunath Bangar";
//		String word = " ";
//
//		for (int i = 0; i < str.length(); i++) {
//			int count = 0; // move count to here so it counts from zero every iteration of outer loop
//			for (int j = i; j < str.length(); j++) {
//				if (str.charAt(i) == str.charAt(j)) {
//					count++;
//				}
//				System.out.println(Occurances(str, word));
//
//			}
//
//		}
//	}
//}

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrences {

    public static void main(String[] args) {
        String input = "Reshma Raghunath Bangar";
        countCharacters(input);
    }

    public static void countCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            // ignore spaces if needed: if (c != ' ')
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print results
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

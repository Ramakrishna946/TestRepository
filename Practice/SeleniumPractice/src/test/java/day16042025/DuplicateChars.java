package day16042025;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {

		public static void main(String[] args) {
	        String str = "RAMAKRISHNACHINTHA";
	        Map<Character, Integer> map = new HashMap<>();

	        for (char ch : str.toCharArray()) {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }

	        System.out.println("Duplicate characters:");
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > 1)
	                System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	    }
	}


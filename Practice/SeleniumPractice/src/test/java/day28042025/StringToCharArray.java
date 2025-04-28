package day28042025;

public class StringToCharArray {
    public static void main(String[] args) {
        String name = "JAVA";

        char[] charArray = name.toCharArray();

        for (char ch : charArray) {
            System.out.println(ch);
        }
    }
}


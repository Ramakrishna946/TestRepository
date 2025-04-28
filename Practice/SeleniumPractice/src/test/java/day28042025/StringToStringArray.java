package day28042025;

public class StringToStringArray {
    public static void main(String[] args) {
        String str = "apple,banana,grape";

        String[] arr = str.split(",");

        for (String s : arr) {
            System.out.println(s);
        }
    }
}



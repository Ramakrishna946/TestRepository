package day28042025;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 12, b = 25, c = 7;

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest number is: " + max);
    }
}

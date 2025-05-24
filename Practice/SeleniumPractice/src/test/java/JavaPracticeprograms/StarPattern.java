package JavaPracticeprograms;

public class StarPattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }
    }
}

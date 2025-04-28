package day16042025;

//public class Factorial {
//    public static void main(String[] args) {
//        int num = 12;
//        long fact = 1;
//
//        for (int i = 1; i <= num; i++) {
//            fact *= i;
//        }
//
//        System.out.println("Factorial of " + num + " is " + fact);
//    }
//}

public class FactorialRecursive {
    public static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 15;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
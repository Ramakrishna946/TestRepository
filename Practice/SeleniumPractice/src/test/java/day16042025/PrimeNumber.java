package day16042025;

public class PrimeNumber {

	public static void main(String[] args) {
		
        int num = 13;
        boolean isPrime = true;

        if (num <= 1) isPrime = false;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(num + " is " + (isPrime ? "a prime number." : "not a prime number."));

	}

}

package JavaPracticeprograms;

public class Sumofnumbers {

	public static void main(String[] args) {
		int num=2213442;
		int dig=0;
		int sum=0;
		
		
		while(num!=0) {
			dig=num%10;
			num=num/10;
			sum+=dig;
			
		}
System.out.println("the sum of the given number is : " +sum);
	}

}

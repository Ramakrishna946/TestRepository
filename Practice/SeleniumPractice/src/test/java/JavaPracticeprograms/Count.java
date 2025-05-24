package JavaPracticeprograms;

public class Count {

	public static void main(String[] args) {
		long num=173266762;
		int count=0;
		long digit=0;
		int even=0;
		int odd=0;
		
		
		while(num>0) {
			digit=num%10;
			num=num/10;
			if(digit%2==0) {
				even++;
			}else {
				odd++;
			}
			
			count++;
			
		}
		System.out.println(" The even  digits of the number is :" +even);
		System.out.println(" The odd  digits of the number is :" +odd);
		System.out.println(" The count of the total digits in this number is :" +count);
		
		

	}

}

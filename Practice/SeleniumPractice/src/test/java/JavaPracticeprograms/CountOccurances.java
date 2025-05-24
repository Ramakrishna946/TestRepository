package JavaPracticeprograms;

public class CountOccurances {

	public static void main(String[] args) {

		String str="Ramakrishna Chintha";
		int initlen=str.length();
		int aftlentofA=str.replace("a", "").length();
		int aftlentofi=str.replace("i", "").length();
		int acount=initlen-aftlentofA;
		int Icount=initlen-aftlentofi;
		System.out.println("the total occurances of a is :" +acount);
		System.out.println("the total occurances of i is :" +Icount);

		
		
	}

}

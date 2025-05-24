//package JavaPracticeprograms;
//
//public class RemoveduplicatesChars {
//	
//public static void main(String[] args) {
//	
//
//	String str="fvcxgrgrhetnfgwqehethwrgaeqetq";
//	String output=removeDuplicates(str);
//	System.out.println("After removing duplicates:  "+ output);
//	//int len=str.length();
//	
//}
//public static String removeDuplicates(String str) {
//	
//	StringBuilder sb=new StringBuilder();
//	
//	for(int i=0; i<str.length(); i++) {
//		char chinput=str.charAt(i);
//		boolean duplicate=false;
//		
//		for(int j=0; j<str.length(); j++){
//			if(sb.charAt(j)==chinput) {
//				duplicate=true;
//				break;
//			}
//			
//			}
//		if(!duplicate) {
//			sb.append(chinput);
//		}
//		
//	}
//	
//	return sb.toString();
//	
//}
//
//}
//
package JavaPracticeprograms;

public class RemoveduplicatesChars {

    public static void main(String[] args) {
        String str = "aaabccddd";
        String output = removeDuplicates(str);
        System.out.println("After removing duplicates: " + output);
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char chinput = str.charAt(i);
            boolean duplicate = false;

            // Check if the character already exists in sb
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == chinput) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                sb.append(chinput);
            }
        }

        return sb.toString();
    }
}

package JavaPracticeprograms;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }
        int first=0;
        int second=0;
        int third=0;
        int fourth=0;

//        int first = Integer.MIN_VALUE;
//        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
            	fourth=third;
            	third=second;
                second = first;
                first = num;
               
            } else if (num > second && num != first) {
            	fourth=third;
            	third=second;
            	second = num;
            	
            }else if (num > third && num != first && num != second) {
            	fourth=third;
            	third=num;
            	
            }else if (num > fourth && num != first && num != second && num != third) {
            	fourth=num;
            	
            }
        }

//        if (second == Integer.MIN_VALUE) {
//            System.out.println("No second largest element found (all elements may be same).");
//        } else {
//            System.out.println("Second largest element is: " + second);
//        }
        System.out.println("Second largest element is: " + second);
    }
}


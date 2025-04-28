package day23042025;

class OuterClass {
    private static String outerStaticVar = "Outer Static Variable";
    
    static class StaticNestedClass {
        void display() {
            System.out.println(outerStaticVar);  // Can access static members of the outer class
        }
    }
}

public class Test {
    public static void main(String[] args) {
        // Instantiating static nested class without an outer class object
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();
    }
}


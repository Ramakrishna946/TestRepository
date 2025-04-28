package day25042025;

class Parent {
    static void show() {
        System.out.println("Parent's static method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child's static method");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();  // Output: Parent's static method
    }
}


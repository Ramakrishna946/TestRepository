package day16042025;


class OverloadExample {
    void display(String msg) {
        System.out.println("String: " + msg);
    }

    void display(int num) {
        System.out.println("Integer: " + num);
    }
}

class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    @Override
    void greet() {
        System.out.println("Hello from Child");
    }
}
public class OverRideOverLoad {
	public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display("Rama");
        obj.display(10);

        Parent p = new Child();
        p.greet(); // Output: Hello from Child
    }
	

}

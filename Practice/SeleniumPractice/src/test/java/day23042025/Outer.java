package day23042025;

public class Outer {
    public void method() {
         int number = 100; // effectively final

        class Inner {
            void display() {
                System.out.println("Number is: " + number);
            }
        }

        Inner inner = new Inner();
        inner.display();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}
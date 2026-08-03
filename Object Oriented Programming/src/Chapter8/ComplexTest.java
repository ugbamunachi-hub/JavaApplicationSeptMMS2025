
package Chapter8;

    public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(9.5, 4.2);
        Complex c2 = new Complex(2.1, 1.8);

        System.out.println("Number 1: " + c1);
        System.out.println("Number 2: " + c2);
        System.out.println("Sum: " + c1.add(c2));
        System.out.println("Difference: " + c1.subtract(c2));
    }
}



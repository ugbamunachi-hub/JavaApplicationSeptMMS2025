
package Chapter8;

public class RationalTest {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 4);
        Rational r2 = new Rational(3, 5);

        System.out.println("Fraction 1 (Reduced): " + r1);
        System.out.println("Fraction 2 (Reduced): " + r2);

        System.out.println("Addition: " + Rational.add(r1, r2));
        System.out.println("Subtraction: " + Rational.subtract(r1, r2));
        System.out.println("Multiplication: " + Rational.multiply(r1, r2));
        System.out.println("Division: " + Rational.divide(r1, r2));

        System.out.println("Fraction 2 Float Format (3 decimals): " + r2.toFloatString(3));
    }
}
  



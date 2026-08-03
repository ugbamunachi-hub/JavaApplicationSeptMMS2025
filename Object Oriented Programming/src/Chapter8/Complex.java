
package Chapter8;

public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
        this(0.0, 0.0);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex rightOperand) {
        return new Complex(this.real + rightOperand.real, this.imaginary + rightOperand.imaginary);
    }

    public Complex subtract(Complex rightOperand) {
        return new Complex(this.real - rightOperand.real, this.imaginary - rightOperand.imaginary);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", real, imaginary);
    }

}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

/**
 *
 * @author HP USER
 */
public class Rational {
  
    private int numerator;
    private int denominator;

    public Rational() {
        this(1, 1);
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = (denominator < 0 ? -numerator : numerator) / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static Rational add(Rational r1, Rational r2) {
        int num = (r1.numerator * r2.denominator) + (r2.numerator * r1.denominator);
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    public static Rational subtract(Rational r1, Rational r2) {
        int num = (r1.numerator * r2.denominator) - (r2.numerator * r1.denominator);
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    public static Rational multiply(Rational r1, Rational r2) {
        return new Rational(r1.numerator * r2.numerator, r1.denominator * r2.denominator);
    }

    public static Rational divide(Rational r1, Rational r2) {
        return new Rational(r1.numerator * r2.denominator, r1.denominator * r2.numerator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public String toFloatString(int precision) {
        return String.format("%." + precision + "f", (double) numerator / denominator);
    }
}

  

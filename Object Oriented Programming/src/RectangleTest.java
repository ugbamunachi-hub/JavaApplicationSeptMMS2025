
import Chapter8.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        // Test default constructor
        Rectangle rect = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.printf("Length: %.2f, Width: %.2f%n", rect.getLength(), rect.getWidth());
        System.out.printf("Perimeter: %.2f, Area: %.2f%n%n", rect.calculatePerimeter(), rect.calculateArea());

        // Test valid custom values
        rect.setLength(12.5);
        rect.setWidth(4.2);
        System.out.println("Modified Rectangle (Valid values):");
        System.out.printf("Length: %.2f, Width: %.2f%n", rect.getLength(), rect.getWidth());
        System.out.printf("Perimeter: %.2f, Area: %.2f%n%n", rect.calculatePerimeter(), rect.calculateArea());

        // Test invalid value validation
        try {
            System.out.println("Attempting to set invalid length (25.0)...");
            rect.setLength(25.0);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception caught: %s%n", e.getMessage());
        }
    }
}



package Chapter8;

public class Rectangle {
    private double length;
    private double width;

    // No-argument constructor initializing defaults to 1.0
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Set method for length with input validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be greater than 0.0 and less than 20.0");
        }
    }

    // Get method for length
    public double getLength() {
        return this.length;
    }

    // Set method for width with input validation
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be greater than 0.0 and less than 20.0");
        }
    }

    // Get method for width
    public double getWidth() {
        return this.width;
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * width;
    }

} 


package Problem3;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        validatePositiveNumber(radius, "Radius");
        this.radius = radius;
    }
    private void validatePositiveNumber(double number, String fieldName) {
        if (number <= 0) {
            throw new IllegalArgumentException(fieldName + " must be greater than zero");
        }
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("%s: Radius: %.2f",
                super.toString(), this.radius);
    }
}
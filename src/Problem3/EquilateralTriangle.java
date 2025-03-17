package Problem3;

public class EquilateralTriangle extends Shape {
    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        super("Equilateral Triangle");
        validatePositiveNumber(sideLength, "Side Length");
        this.sideLength = sideLength;
    }

    private void validatePositiveNumber(double number, String fieldName) {
        if (number <= 0) {
            throw new IllegalArgumentException(fieldName + " must be greater than zero");
        }
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return 3 * sideLength;
    }

    @Override
    public String toString() {
        return String.format("%s: Side Lengths: %.2f, %.2f, %.2f",
                super.toString(), this.sideLength, this.sideLength, this.sideLength);
    }
}

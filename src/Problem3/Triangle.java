package Problem3;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super("Triangle");
        validateSideLengths(sideA, sideB, sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private void validateSideLengths(double... sideLengths) {
        for (double sideLength : sideLengths) {
            validatePositiveNumber(sideLength, "Side length");
        }
        if (sideLengths[0] + sideLengths[1] <= sideLengths[2] ||
                sideLengths[0] + sideLengths[2] <= sideLengths[1] ||
                sideLengths[1] + sideLengths[2] <= sideLengths[0]) {
            throw new IllegalArgumentException("Side lengths cannot form a triangle");
        }
    }

    private void validatePositiveNumber(double number, String fieldName) {
        if (number <= 0) {
            throw new IllegalArgumentException(fieldName + " must be greater than zero");
        }
    }

    @Override
    public double area() {
        // Heron's formula
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void scale(double scaleFactor) {
        this.sideA *= scaleFactor;
        this.sideB *= scaleFactor;
        this.sideC *= scaleFactor;
    }

    @Override
    public String toString() {
        return String.format("%s: Side Lengths: %.2f, %.2f, %.2f",
                super.toString(), this.sideA, this.sideB, this.sideC);
    }
}

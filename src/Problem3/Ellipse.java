package Problem3;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a > b) {
            this.majorAxis = a;
            this.minorAxis = b;
        } else {
            this.majorAxis = b;
            this.minorAxis = a;
        }
        validatePositiveNumber(this.majorAxis, "Major Axis");
        validatePositiveNumber(this.minorAxis, "Minor Axis");
    }

    private void validatePositiveNumber(double number, String fieldName) {
        if (number <= 0) {
            throw new IllegalArgumentException(fieldName + " must be greater than zero");
        }
    }

    @Override
    public double area() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double perimeter() {
        double h = ((majorAxis - minorAxis) * (majorAxis - minorAxis)) / ((majorAxis + minorAxis) * (majorAxis + minorAxis));
        return Math.PI * (majorAxis + minorAxis) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }

    @Override
    public void scale(double scaleFactor) {
        this.majorAxis *= scaleFactor;
        this.minorAxis *= scaleFactor;
    }

    @Override
    public String toString() {
        return String.format("%s: Major Axis: %.2f, Minor Axis: %.2f",
                super.toString(), this.majorAxis, this.minorAxis);
    }

}

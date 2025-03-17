package Problem3;

public abstract class Shape {
    private final String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return String.format("%s: Area = %.2f, Perimeter = %.2f",
                shapeName, area(), perimeter());
    }
}

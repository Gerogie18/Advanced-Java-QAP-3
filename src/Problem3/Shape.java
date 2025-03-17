package Problem3;

import Problem4.Scalable;

public abstract class Shape implements Scalable {
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

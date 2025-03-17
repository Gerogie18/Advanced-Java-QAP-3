package demos;

import Problem3.*;
import Problem4.Scalable;

public class Demo3 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Ellipse(3, 4),
                new EquilateralTriangle(6),
                new Triangle(3, 4, 5),
        };

        //I could have only used the shape string override, but it looked better for each shape to have it's own override.
        System.out.println("Before scaling");
        for (Shape shape : shapes) {
            System.out.println();
            System.out.println(shape.toString());
            shape.sca
        }
    }
}


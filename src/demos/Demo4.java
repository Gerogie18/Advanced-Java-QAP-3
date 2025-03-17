package demos;

import Problem3.*;
import Problem4.Scalable;

public class Demo4 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Ellipse(3, 4),
                new EquilateralTriangle(6),
                new Triangle(3, 4, 5),
        };

        System.out.println();
        System.out.println("Before Scaling");
        for (Shape shape : shapes) {
            System.out.println();
            System.out.println(shape.toString());
            ((Scalable) shape).scale(2.0);
        }

        System.out.println();
        System.out.println("After Scaling");
        for (Shape shape : shapes) {
            System.out.println();
            System.out.println(shape.toString());
        }
    }
}
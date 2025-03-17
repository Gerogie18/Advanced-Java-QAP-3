package demos;

import Problem3.*;

public class Demo3 {
    public static void main(String[] args) {
        String[] shapes = new String[] {
                new Circle(5).toString(),
                new Ellipse(3, 4).toString(),
                new EquilateralTriangle(6).toString(),
                new Triangle(3, 4, 5).toString()
        };

        //I could have only used the shape string override, but it looked better for each shape to have it's own override.
        for (String shapePrint : shapes) {
            System.out.println();
            System.out.println(shapePrint);
        }
    }
}

package demos;

import Problem2.*;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println();

        MovablePoint point = new MovablePoint(1.0f, 2.0f, 0.5f, 0.7f);
        System.out.println("Initial point: " + point.toString());

        point.move();
        System.out.println("Point after moving: " + point.toString());

        point.move(0.2f, 0.3f);
        System.out.println("Point after moving with new speed: " + point.toString());
    }
}

package com.multi.homework._20250801.shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[]shapes={
                new Circle("원", 4.0),
                new Rectangle("네모", 5, 10),
                new Triangle("세모", 10, 8)

        };
        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }
}

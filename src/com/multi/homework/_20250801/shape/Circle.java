package com.multi.homework._20250801.shape;

public class Circle extends Shape {

    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double area(double radius) {
        return 3.14*radius*radius;
    }
    public double area(){
        return area();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("반지름: "+ radius);
        System.out.println("넓이: "+area(radius));
        System.out.println("반지름: 10, "+"넓이: "+area(10));
    }
}

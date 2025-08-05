package com.multi.homework._20250801.shape;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public int area(int width, int height) {
        return width*height;
    }

    public int area() {
        return area(this.width, this.height);
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("가로: "+width+", 세로: "+height);
        System.out.println("넓이: "+area(width,height));
    }
    
}

package com.multi.homework._20250801.shape;

public class Triangle extends Shape {
    int base;
    int height;

    public Triangle(String name, int base, int height) {
        super(name);
        this.height = height;
        this.base = base;
    }

    public int area(int base, int height) {
        return base*height/2;
    }

    public int area(){
        return area(this.base,this.height);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("밑변: "+base+", 높이: "+height);
        System.out.println("넓이: "+area(base,height));
    }
}

package com.multi.homework._20250731;

public class Rectangle {

    int width;
    int height;

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getSize(){
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setSize(30, 15);
        System.out.println("가로: "+rectangle.width+", 세로: "+rectangle.height + ", 넓이: "+rectangle.getSize());
    }


}

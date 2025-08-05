package com.multi.homework._20250731;

public class Product {
    String productName;
    int price;

    public Product(String product, int price) {
        this.productName = product;
        this.price = price;
    }

    @Override
    public String toString() {
        return ("상품명: " + productName + ", 가격: " + price);
    }

    public static void main(String[] args) {
        Product[] arr = new Product[3];
        arr[0] = new Product("아이폰", 1300000);
        arr[1] = new Product("에어팟", 250000);
        arr[2] = new Product("맥북", 2000000);

        for(Product item : arr){
            System.out.println(item.toString());
        }
    }
}

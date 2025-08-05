package com.multi.Object.inheritance1;

public class Me extends  Father {
    private String message;
    public void sayMe(){
        System.out.println("sayMe");
    }

    @Override
    public void sayFather() {
        System.out.println("sayFather Me");
    }
    @Override
    public void sayGrandFather() {
        System.out.println("sayGrandFather Me");
    }
}

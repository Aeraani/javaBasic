package com.multi.Object.package1;

public class SubClass extends SuperClass {
    public SubClass() {

        //SuperClass의 후손 생성자
        this.publicData=100;
        this.protectedData=100;
        this.defaultData=100;
        // this.privateData=100; privarte는 자기 자긴만 접근 가능
    }
}

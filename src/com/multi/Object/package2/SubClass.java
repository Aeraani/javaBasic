package com.multi.Object.package2;

import com.multi.Object.package1.SuperClass;

import java.util.Arrays;

public class SubClass extends SuperClass {
    public SubClass() {
        this.publicData=100;
        this.protectedData=100;
        // this.defaultData=100; 패키지가 다르면 default는 접근 불가
        // this.privateData=100;//error
    }
}

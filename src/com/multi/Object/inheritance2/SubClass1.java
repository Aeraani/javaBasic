package com.multi.Object.inheritance2;
//객체를 유기적으로 연결 하는 것을 상속이라 한다.
public class SubClass1 extends SuperClass{
    private int subClassValue;
    public SubClass1(int superClassValue, int subClassValue){//생성자
        super(superClassValue);
        this.subClassValue = subClassValue;
        //this.superClassValue=2; 선조가 Private 처리하면 접근 불가
    }

    @Override
    public String toString() {
        return super.toString()+" "+String.valueOf(this.subClassValue);
    }
}

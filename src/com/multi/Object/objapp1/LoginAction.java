package com.multi.Object.objapp1;

public class LoginAction extends Action {
    @Override
    public void execute() {
        super.execute(); //선조꺼 부르기
        System.out.println("LoginAction Executed");
    }
}

package com.multi.Object.objapp1;

public class ActionMain {
    public static void main(String[] args) {

        LoginAction loginAction=new LoginAction();
        DeleteAction deleteAction=new DeleteAction();
        loginAction.execute();//라이딩한 자신의 메소드가 불려짐
        deleteAction.execute();//선조 Action의 execute 메서드가 불려짐
    }
}

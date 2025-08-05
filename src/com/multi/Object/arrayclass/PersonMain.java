package com.multi.Object.arrayclass;

import java.util.Scanner;

public class PersonMain {
    Scanner scanner = new Scanner(System.in);
    Person [] p;
    int count;
    public PersonMain() {
        System.out.println("Person Count.");
        p=new Person[scanner.nextInt()];
        for(int i=0;i<p.length;i++){
            p[i]=new Person();
        }
        System.out.println(p.length+"인원 생성" );
        menu();
        //disp(p);
    }
    public void personAdd(){
        if(count==p.length)return;
        System.out.println("Name:");
        p[count].setName(scanner.next());
        System.out.println("Age3:");
        p[count].setAge(scanner.nextInt());
        System.out.println("Address:");
        p[count].setAddress(scanner.next());
        System.out.println(++count+"명 추가");
    }
    public void menu(){
        while(true){
        System.out.println("1.Add 2.List 3. Modify 4. Delete 5. Exit");
        switch (scanner.nextInt()){
            case 1: personAdd();break;
            case 2:
                disp();
                break;
            case 3:break;
            case 4:break;
            case 5:return;
        }
        }
    }
    public void disp(){
        for(int i=0;i<p.length;i++){
            System.out.println(p[i]);
        }
    }
    public static void main(String[] args) {
        new PersonMain();
    }
}

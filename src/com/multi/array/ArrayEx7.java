package com.multi.array;
//1차원 Array기반 CRUD (create, read, update, delete)
//isFull, isEmpty, add, disp, search, delete, modify
public class ArrayEx7 {
    int []m=new int[5];
    int size=m.length;
    int count=0;

    public boolean isFull(){
        return count>=size;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void add(int item){
        if(!isFull()){
            m[count++]=item;
        }else{
            System.out.println("Array is Full Cannot Add"+item);
        }
    }
    public void disp(){
        if(isEmpty()){
            System.out.println("Array is Empty");
        }else{
            for(int i=0;i<count;i++){
                System.out.print(m[i]+"\t");
            }
            System.out.println();
        }
    }
    public int search(int data){
        for(int i=0; i<m.length; i++){
            if(m[i]==data)return i;
        }
        return -1;
    }
    public void delete(int item) {
        int index=search(item);
        if(index==-1) {
            System.out.println("Not Found!");
            return;
        }
        for(int i=index;i<count-1;i++) {
            m[i]=m[i+1];
        }
        count--;
        System.out.println("Delete item="+index);
    }

    public void modify(int origin,int change) {
        int index=search(origin);
        if(index>=0&& index<count) {
            m[index]=change;
            System.out.println("Modified index "+index+" with"+change);
        }else {
            System.out.println("Not Found!");
        }

    }
    public static void main(String[] args) {
        ArrayEx7 a=new ArrayEx7();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.disp();
        a.modify(30, 300);
        a.disp();
        a.delete(300);
        a.disp();

    }
}
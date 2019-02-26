package com.company;

public class Sol11 {
    public static void main(String args[]){
        Table1 obj = new Table1();//only one object
        MyThrd1 t1=new MyThrd1(obj);
        MyThrd2 t2=new MyThrd2(obj);
        t1.start();
        t2.start();
    }
}


class MyThrd1 extends Thread{
    Table1 t;
    MyThrd1(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThrd2 extends Thread{
    Table1 t;
    MyThrd2(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(10);
    }
}


class Table1{

    void printTable(int n){
        synchronized(this){                 //synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }
}



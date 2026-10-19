package org.corejava;
class A
{
    public A(){
        System.out.println("In A");
    }
}
class B extends A
{
    public B(){
        System.out.println("In B");
    }
    public B(int n){
        System.out.println("In B int");
    }
}

public class ThisAndSuper
{
    public static void main(String[] args)
    {
        B b = new B(20);
    }
}

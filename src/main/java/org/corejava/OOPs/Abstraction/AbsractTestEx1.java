package org.corejava.OOPs.Abstraction;

/* Abstract Method */

class A{
    //Not Valid - Abstract method can not have method implementation
    /*public abstract void m1(){


    }*/
    //Not Valid - if a class contains at least one Abstract method, that class should be declared as abstract
//    public abstract void m1();

}
abstract class B {
    //Not Valid - if you don't want to clear body then compulsory we need to declare as abstract
    //public void m1();
    //Valid -  First thing class declared as abstract and has one abstract method without implementation
    public abstract void m1();

    public void m2(){

    }
}

public class AbsractTestEx1 {
    public static void main(String[] args) {
        A a = new A();
       // B b= new B(); //'B' is abstract; cannot be instantiated
    }
}

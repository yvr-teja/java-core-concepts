package org.corejava.OOPs.Abstraction;

abstract class TestAbstractExample {
public abstract void m1();
/*
Valid -  Class declared and having at least one abstract method,
compulsory then class should be abstract.
Question: if there is no method in abstract method can we create it as abstract class.
Ans: Yes we can create a abstract class with a abstract method.
    But if there is any abstract method in any class then that class should be declared as abstract.
*/

    public static void main(String[] args) {
       // TestAbstractExample testAbstractExample= new TestAbstractExample() ;
        //testAbstractExample.m1();
        /*TestAbstractEx2 test=new TestAbstractEx2();
        test.m1();
        test.m2();*/
        /* If we declare abstract class then we can object for that class.
         */

    }
}

package org.corejava.OOPs.constructors;
class A{
    A() {
        System.out.println("Constructor A");
    }
}
class B extends A{
    B() {
        System.out.println("Constructor B");
    }
}
public class C extends B{
    C() {
        System.out.println("Constructor C");
    }
}

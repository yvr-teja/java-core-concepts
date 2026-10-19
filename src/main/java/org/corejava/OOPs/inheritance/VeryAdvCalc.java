package org.corejava.OOPs.inheritance;
//Java does not support multiple inheritance
/*class A{

}
class B extends A{

}
class C extends A,B{ //multiple inheritance

}*/
//Multi-Level inheritance
public class VeryAdvCalc extends AdvCalc{
    public double power(int a, int b){
        return Math.pow(a,b);
    }
}

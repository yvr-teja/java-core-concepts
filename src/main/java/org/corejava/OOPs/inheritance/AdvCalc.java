package org.corejava.OOPs.inheritance;
//AdvCalc is a Calc ->  is-a Relationship
//Single level inheritance
public class AdvCalc extends Calc {
    public int muti(int a, int b){
      return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

package org.corejava.CastingAndWrapper;

class AClass{
    public void show1(){
        System.out.println("in a showing A");
    }
}
class BClass extends AClass{
    public void show2(){
        System.out.println("in a showing B");
    }
}

public class UpCastingVSDownCasting {
    public static void main(String[] args) {
        //Type casting
        double d=4.5;
        int i=(int)d;
        System.out.println(i);

        //UpCasting
        AClass obj= new BClass(); // (A) new B();
        obj.show1();

        //DownCasting
        BClass obj1 = (BClass)obj;
        obj1.show2();
    }
}

package CastingAndWrapper;

class A{
    public void show1(){
        System.out.println("in a showing A");
    }
}
class B extends A{
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
        A obj= new B(); // (A) new B();
        obj.show1();

        //DownCasting
        B obj1 = (B)obj;
        obj1.show2();
    }
}

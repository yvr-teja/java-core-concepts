package org.corejava.CastingAndWrapper;

public class WrapperExample {

    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        Integer no=25;
//        Integer a=10;
//        Integer b=20;
//
//        swap(a,b);
//        System.out.println(a+" "+b);

//        final int bonus=20;
//        bonus=30;

//        final AtomicInteger bonus= new AtomicInteger(2);
//        bonus.set(5);
//        System.out.println(bonus);

        A obj;

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("teja");
        }

    }

    static void swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }

}
/*
class A{
    //final int number;
    final int number=20;
    String name="raviteja";

    public A(String nam)
    {
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object destroyed");
    }
}*/

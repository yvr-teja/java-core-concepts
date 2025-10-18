package org.corejava.genericsexample;

//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
        //not used generics
        ArrayList<String> list =new ArrayList<String>();
        list.add("Hello");
        list.add("30");
        list.add("A");
        String s1=list.get(0);
        String s2=list.get(1);
        String s3=list.get(2);

        System.out.println(s1+s2+s3);

       // String strName = (String) list.get(0);
       // String intAge = (String) list.get(1);
    */
        //Generic class
        Box<Integer> box=new Box<>(); //Box is now Type safe
        box.setValue(1);
        //String i= (String)box.getValue();
        int intValue= box.getValue();
        System.out.println(intValue);
        //System.out.println(i);

        //Generic with class in constructor
        Pair<String,Integer> pair =new Pair<>("Age",30);
        String age= pair.getKey();
        int ageValue =pair.getValue();
        System.out.println(age+"-"+ageValue);

        //Generics in Interface

    }
}

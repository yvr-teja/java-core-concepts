package org.corejava.String_StringBuffer_StringBuilder.Strings;

public class TestString {
    public static void main(String[] args) {
        /*String name="Vishal";
        System.out.println(name);*/
    /*    Student student=new Student();
        student.name="raviteja";
        student.address="malakpet";
        student.standard=4;
        student.rollNumber=1024;
        System.out.println(student.toString());*/
       /* String a=new String("Ram");
        String b=new String("Ram");
        String c="Ram";
        String d="Ram";
        System.out.println("a==b"+a==b);
        System.out.println("c==d"+c==d);*/
        //String is immutable
        String s= new String("ravi teja");
        s.concat("Software");
        //we need to store it in another variable - it creates new memory location
        String s1="Sai";
        s1=s1.concat("Software");

        StringBuffer sb= new StringBuffer("ravi teja  ");
        sb.append("Software");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(sb);

        Object object = new Object();

    }
}

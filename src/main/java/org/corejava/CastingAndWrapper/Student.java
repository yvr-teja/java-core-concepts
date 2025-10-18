package org.corejava.CastingAndWrapper;

public class Student {

    public static void main(String[] args) {
        //System.out.println("Testing");
//        Students students=new Students();
//        System.out.println(students.rollNo);
//        System.out.println(students.name);
//        System.out.println(students.marks);
      //Students students2=new Students(25,"Teja",82);
       // Students students2=new Students(28,"Sai",95);
//        System.out.println(students2.rollNo);
//        System.out.println(students2.name);
//        System.out.println(students2.marks);
//        Students student3=new Students(students2);
//        System.out.println(student3.rollNo);
//        System.out.println(student3.name);
//        System.out.println(student3.marks);
//        Students random =new Students();
//
//        System.out.println(random.rollNo);
//        System.out.println(random.name);
//        System.out.println(random.marks);
        //both objects will point to one heap memory
        Students studentsone=new Students();
        Students studentstwo=studentsone;
        studentsone.name="something Something";
        System.out.println(studentstwo.name);

    }
}
class Students{
    int rollNo;
    String name;
    float marks;

    Students(Students others){
        this.rollNo=others.rollNo;
        this.name=others.name;
        this.marks= others.marks;
    }

    Students(){
        this (7,"Gayathri",100);
    }
    Students(int rNO,String nam, float mark){
        this.rollNo=rNO;
        this.name=nam;
        this.marks=mark;
    }
}



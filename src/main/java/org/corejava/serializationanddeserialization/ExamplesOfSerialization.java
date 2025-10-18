package org.corejava.serializationanddeserialization;

import java.io.*;

public class ExamplesOfSerialization  {
    public static void main(String[] args)  {
        Student student=new Student();
        student.name="Ravi";
        student.rollNum=100;
        student.grade="10th";
        System.out.println("Before Serialization-->"+" Name :"+ student.name+", Roll number:"+ student.rollNum);

        String filename="D:\\programs\\serializationFiles\\testdeserialization.txt";

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(student);

            obs.close();
            fos.close();
            System.out.println("Object saved to file succsfully");
        } catch (IOException e) {
            System.out.println("file save failed");
            throw new RuntimeException(e);
        }


    }
}

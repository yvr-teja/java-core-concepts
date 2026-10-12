package org.corejava.serializationanddeserialization;

import java.io.*;

public class ExamplesOfSerialization {
    public static void main(String[] args) {

        Student student = new Student();
        student.rollNum=123;
        student.name="Ravi Teja";
        student.grade="b.tech";
        //student.password="hello1234";

         String fileName = "/home/teja/Documents/MyGitProjects/src/main/java/org/corejava/serializationanddeserialization/Testfile.txt";

         try{
             FileOutputStream fos=new FileOutputStream(fileName);
             ObjectOutputStream oos=new ObjectOutputStream(fos);
             oos.writeObject(student);

             oos.close();
             fos.close();

         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
    }
}
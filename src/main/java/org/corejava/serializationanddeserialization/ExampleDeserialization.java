package org.corejava.serializationanddeserialization;

import java.io.*;

public class ExampleDeserialization {


    public static void main(String[] args) {
        String fileName="/home/teja/Documents/MyGitProjects/src/main/java/org/corejava/serializationanddeserialization/Testfile.txt";

        try {
            FileInputStream fis=new FileInputStream(fileName);
            ObjectInputStream ois=new ObjectInputStream(fis);

            Student obj=(Student)ois.readObject();
            System.out.println(obj.rollNum);
            System.out.println(obj.name);
            System.out.println(obj.grade);
            System.out.println(obj.password);
           // System.out.println(obj.university);
            //System.out.println(obj.toString());

            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
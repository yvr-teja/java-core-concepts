package org.corejava.serializationanddeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ExampleDeserialization implements Serializable {
    public static void main(String[] args) {
        String fileName="D:\\programs\\serializationFiles\\testdeserialization.txt";
try {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

    org.corejava.serializationanddeserialization.Student student =(org.corejava.serializationanddeserialization.Student) ois.readObject();
    System.out.println(student.name);
    System.out.println(student.rollNum);
    ois.close();
    fis.close();
}
    catch (Exception e){
        System.out.println(e);
    }

    }
}

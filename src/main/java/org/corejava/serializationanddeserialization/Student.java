package org.corejava.serializationanddeserialization;

import java.io.Serializable;

public class Student implements Serializable {
    public String name;
    public int rollNum;
    public String grade;
    public volatile String password="hello1234";

    
    // Static field - NOT serialized
   // public static String university = "State University";

    }

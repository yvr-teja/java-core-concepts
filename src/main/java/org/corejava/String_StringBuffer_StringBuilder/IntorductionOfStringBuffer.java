package org.corejava.String_StringBuffer_StringBuilder;

public class IntorductionOfStringBuffer {
    
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("Ravi");
        System.out.println(sBuffer.hashCode());

        sBuffer.append(" Charan");
        System.out.println(sBuffer.hashCode());

    }
}

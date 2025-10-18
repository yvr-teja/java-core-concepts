package org.InterviewQuestions;

public class RemoveNonASCIIString{
    public static void main(String [] args){
        String str = "Instance¡of¥java";
        System.out.println(str);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        System.out.println("After removing non ASCII chars:");
        System.out.println(str);
    }
}

package org.corejava.String_StringBuffer_StringBuilder;
public class IntorductionOfString {

    public static void main(String[] args) {
       
        String greetings="Hello";
        System.out.print(greetings);
        String txt="Ravi Teja";
        System.out.println(txt.length());     
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.charAt(4));
        System.out.println(txt.charAt(5));

        String firstName="Ravi";
        String lastName=" Teja";
        String finalStr=firstName.concat(lastName);
        System.out.println(finalStr);
        

    }
}

package org.corejava.String_StringBuffer_StringBuilder.Strings;

public class SwapTwoStringWithoutTemp {
    public static void main(String[] args) {
        String str1="Ravi";
        String str2="Teja";
        System.out.println("before swap str1"+str1);
        System.out.println("before swap str2"+str2);

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("after swap str1"+str1);
        System.out.println("after swap str2"+str2);

    }
}

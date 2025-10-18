package org.corejava.String_StringBuffer_StringBuilder.Strings;

public class ReverseOfString {
    public static void main(String[] args) {
        /* Approach -1 */
        String s1="Welcome";
        String revS1="";    //output: emoclew

        for (int i=s1.length()-1;i>=0;i--){
            revS1=revS1+s1.charAt(i);
        }
      //  System.out.println(revS1);

        /* Approach -2 */
        String s2="RaviTeja";
        String revS2="";

        char arr []= s2.toCharArray();

        for (int i = arr.length-1; i >=0; i--) {
            revS2=revS2+ arr[i];
        }
        System.out.println(revS2);
    }
}

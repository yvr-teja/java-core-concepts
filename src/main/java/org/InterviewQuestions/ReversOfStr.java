package org.InterviewQuestions;

public class ReversOfStr
{
    public static void main(String[] args) {
        String nameStr="Ravi Teja Yedlapalli";
        StringBuffer revStr=new StringBuffer(nameStr);
       //String reversedStr= revStr.reverse();
        System.out.println(revStr.reverse());

        String[] words = nameStr.split(" ");

        for (String word : words) {

            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }

            System.out.print(" ");
        }
    }



}


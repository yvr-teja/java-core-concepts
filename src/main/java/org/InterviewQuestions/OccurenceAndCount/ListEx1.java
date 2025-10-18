package InterviewQuestions.OccurenceAndCount;

import java.util.*;


public class ListEx1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Sai","Ravi","Hari","Sai","Hari","Ravi","Gayathri","Bhanu");

        Map<String,Integer> result=new HashMap<>();

        for (String tempStr: stringList){
            result.put(tempStr,result.getOrDefault(tempStr,0)+1);
        }
        //System.out.println(result);

        result.forEach((k,v)-> System.out.println(k+":"+v));
    }
}

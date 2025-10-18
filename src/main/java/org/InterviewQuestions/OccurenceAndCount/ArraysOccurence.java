package InterviewQuestions.OccurenceAndCount;

import java.util.HashMap; 
import java.util.Map;
 
public class ArraysOccurence {
    public static void main(String[] args) {
        String name[]={"A","B","C","A","C"};

        HashMap<String,Integer> helper =new HashMap<>();
        for (String s:name){
            helper.put(s, helper.getOrDefault(s,0)+1);
        }
        for (Map.Entry<String, Integer> entry: helper.entrySet()){
            //helper.put(entry.getKey(), entry.getValue());
            System.out.println(entry.getKey()+"  : Occurrence--> "+entry.getValue());
        }
    }
}

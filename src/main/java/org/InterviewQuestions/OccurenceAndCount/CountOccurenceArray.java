package InterviewQuestions.OccurenceAndCount;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 

public class CountOccurenceArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "A", "E", "B", "D");

        Map<String, Integer> occurrenceMap = new HashMap<>();

        // Counting occurrences using Map only
        for (String str : list) {
            occurrenceMap.put(str, occurrenceMap
                    .getOrDefault(str, 0) + 1);
        }

        // Displaying occurrences
        System.out.println("Element occurrences:");
        occurrenceMap.
                forEach((key, value) ->
                        System.out.println(key + " : " + value));
    }
}

package InterviewQuestions.removeDuplicates.ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListRemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");

        LinkedHashSet<String> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println(list);
    }
}

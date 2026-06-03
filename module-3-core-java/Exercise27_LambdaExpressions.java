import java.util.*;

public class Exercise27_LambdaExpressions {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Banana");
        list.add("Apple");
        list.add("Orange");

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println("Sorted List:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
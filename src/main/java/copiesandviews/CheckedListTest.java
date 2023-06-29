package copiesandviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedListTest {

    public static void main(String[] args) {
        var strings = new ArrayList<String>(List.of("hey", "kamar"));
        ArrayList hackedList = strings;
        hackedList.add(25);

        List<String> safeList = Collections.checkedList(strings, String.class);
        safeList.add("key");

        System.out.println(strings);

        var names = Collections.checkedList(new ArrayList<>(), String.class);
        List hackedNames = names;
        hackedNames.add(25);
        System.out.println(names);

    }
}

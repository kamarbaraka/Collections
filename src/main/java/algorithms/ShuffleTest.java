package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {

    public static void main(String[] args) {
        var numbers  = new ArrayList<Integer>(50);
        for (int i = 1; i < 50; i++)
            numbers.add(i);

        Collections.shuffle(numbers);
        var sub = numbers.subList(0, 6);
        Collections.sort(sub);
        System.out.println(sub);

        List<String> names = new ArrayList<>(List.of("kamar", "nagri", "hey", "karisa", "no", "kombe"));
        names.removeIf(v -> v.length() < 5);
        names.replaceAll(String::toUpperCase);

        System.out.println(names);

    }
}

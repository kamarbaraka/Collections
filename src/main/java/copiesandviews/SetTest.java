package copiesandviews;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {
        var names = new TreeSet<>(Set.of("kamar", "baraka", "kahindi", "kombe", "katore"));
        var firsts = names.subSet("kamar", true, "kahindi", true);
        System.out.println(firsts);

    }
}

package sets.treesets;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        var names = new TreeSet<String>(List.of("kamar", "baraka", "ngari", "kombe", "kahindi"));
        names.forEach(System.out::println);

        var spoon = new Item(1252, "spoon");
        var key = new Item(15796, "key");
        var spoiler = new Item(1475, "spoiler");

        var items = new TreeSet<Item>(List.of(spoon, key, spoiler));
        System.out.println(items);

        var items1 = new TreeSet<Item>(Comparator.comparing(Item::getItemDescription));
        items1.addAll(items);
        System.out.println(items1);

    }
}

package algorithms;

import sets.treesets.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class SortingTest {

    public static void main(String[] args) {
        var gas = new Item(1245, "gas");
        var dryer = new Item(1844, "dryer");
        var oven = new Item(4588, "oven");
        var cup = new Item(4555, "cup");
        var pan = new Item(1789, "pan");
        var spoon = new Item(1756, "spoon");

        var itemArray = new ArrayList<>(List.of(gas, dryer, oven, cup, pan, spoon));
        itemArray.forEach(System.out::println);
        itemArray.sort(Comparator.comparing(Item::getItemNumber));
        System.out.println("....................................");
        itemArray.forEach(System.out::println);
        System.out.println("......................................");

        var itemNumberArray = new ArrayList<Integer>();
        itemArray.forEach(v -> itemNumberArray.add(v.getItemNumber()));
        itemNumberArray.sort(Comparator.reverseOrder());
        itemNumberArray.forEach(System.out::println);

        System.out.println(max(itemArray));

    }

    public static <T extends Comparable > T max(Collection<T> collection){

        var iter = collection.iterator();
        var largest = iter.next();
        while (iter.hasNext()){
            var next = iter.next();
            if (largest.compareTo(next) < 0)
                largest = next;
        }
        return largest;
    }
}

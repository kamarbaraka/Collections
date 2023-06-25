package linked_lists;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        var listA = new LinkedList<String>();
        var listB = new LinkedList<String >();

        listA.add("kamar");
        listA.add("baraka");
        listA.add("kahindi");

        listB.add("samson");
        listB.add("ngari");
        listB.add("kombe");
        listB.add("karisa");
        listB.add("katore");

        var iterA = listA.listIterator();
        var iterB = listB.iterator();

        while (iterB.hasNext()){
            if (iterA.hasNext())
                iterA.next();
            iterA.add(iterB.next());
        }

        System.out.println(listA);

        iterB = listB.iterator();

        while (iterB.hasNext()){
            iterB.next();
            if (iterB.hasNext())
                iterB.next();
            iterB.remove();
        }

        System.out.println(listB);

        listA.removeAll(listB);

        System.out.println(listA);
    }
}

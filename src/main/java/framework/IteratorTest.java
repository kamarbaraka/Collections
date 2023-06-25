package framework;

import java.util.*;
import java.util.logging.Logger;

public class IteratorTest {

    public static void main(String[] args) {
        List<String> myNames = new ArrayList<>(Arrays.asList("kamar", "baraka", "kahindi"));
        myNames.forEach(System.out::println);
        System.out.println(has(myNames, "kamar"));
        myNames.remove("baraka");
        System.out.println(myNames);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("kamar");
        linkedList.add("bob");
        linkedList.add("evans");
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        var iter = linkedList.listIterator();
        iter.next();
        iter.add("samson");
        //iter.remove();
        linkedList.remove("evans");
        System.out.println(linkedList);

        List<String> names = new ArrayList<>();
        names.add("kamar");
        var iter3 = names.listIterator();
        var iter4 = names.listIterator();
        iter3.next();
        iter3.set("kahindi");
        System.out.println(names);
        iter4.next();
        iter4.set("baraka");
        System.out.println(names);

        Map<String, Object> data = new TreeMap<>();
        data.put("name", "kamar");
        data.put("age", 23);
        data.put("job", "developer");

        var name = (String)data.get("name");

        var listONames = new LinkedList<String>(List.of("kamar", "baraka"));
        var iter1 = listONames.iterator();
        var iter2 = listONames.iterator();
        iter1.next();
        iter1.remove();

    }

    public static <E> boolean has(Collection<E> collection, Object obj){
        for (E element : collection)
            if (element.equals(obj))
                return true;

        return false;
    }
}

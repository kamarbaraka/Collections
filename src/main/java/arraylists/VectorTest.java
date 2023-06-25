package arraylists;

import com.sun.source.tree.Tree;

import java.util.*;

public class VectorTest {

    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("kamar");
        list.add("baraka");
        list.forEach(System.out::println);
        System.out.println(list);

        var sort = list.stream().sorted();
        System.out.println(sort.toList());

        Map<String, HashMap<String, ?>> table = new Hashtable<>();
        table.put("kamarbaraka",new HashMap<>());


    }

    public static <T> T stringHelper(T string){
        return string;
    }
}

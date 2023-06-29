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

        Map<String, HashMap<String, Object>> table = new Hashtable<>();
        table.put("kamarbaraka",new HashMap<>());
        table.get("kamarbaraka").put("name", "kamar");
        var name = table.get("kamarbaraka").get("name");
        System.out.println(name);


    }

    public static <T> T stringHelper(T string){
        return string;
    }
}

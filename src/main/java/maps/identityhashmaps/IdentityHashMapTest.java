package maps.identityhashmaps;

import java.util.*;

public class IdentityHashMapTest {

    public static void main(String[] args) {
        var map = new IdentityHashMap<>(Map.of("name", "kamar", "age", "23", "job", "developer"));
        map.putAll(Map.of("school", "develhope", "car", "cullinan"));
        map.put("car", "rolce royys cullinan");

        System.out.println(map.entrySet());

        List<String> mes = Collections.nCopies(10, "kamar");
        System.out.println(mes);

        var list = new ArrayList<>(List.of("kamar", "baraka", 23));
        list.add("kahindi");
        list.set(0, "me");
        System.out.println(list);

        var lst = List.of("kamy", "john", "teh");
        System.out.println(Arrays.asList("kamar", "baraka", "kahindi").set(1, "me"));

        var names = new ArrayList<>(List.of("kamar", "baraka", "kombe"));
        var nameSet = List.copyOf(names);
        System.out.println(nameSet);
        names.set(1, "set");
        System.out.println(nameSet);

    }
}

package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        var record = new LinkedHashMap<String, String>(10, 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > 6;
            }
        };

        record.put("name", "kamar");
        record.put("first", "baraka");
        record.put("second", "ngari");
        record.put("last", "kahindi");
        record.put("age", "23");
        record.put("job", "developer");

        record.forEach((k, v) -> System.out.println(v));
        System.out.println();

        record.get("age");
        record.get("job");

        record.forEach((k, v) -> System.out.println(v));
    }
}

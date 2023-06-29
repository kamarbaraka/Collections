package maps;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();
        person.put("name", "kamar");
        person.put("age", "23");
        person.put("job", "developer");

        person.forEach((k, v) -> System.out.printf("%s -> %s\n", k, v));

        var emp = new Employee("kamar", 23, "developer");
        System.out.println(emp);
        var emp1 = new Employee("kombo", 35, "web-developer");

        var employees = new HashMap<String, Employee>();
        employees.put("first", emp);
        employees.put("second", emp1);

        System.out.println(employees);

        employees.forEach((k, v) -> System.out.println(v.name()));
        var emps = employees.entrySet();
        emps.forEach(v -> System.out.println(v.getKey()));
        System.out.println(emps);

        var tarray = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5));
        System.out.println(tarray.stream().reduce(Integer::sum).stream().toList());

    }
}

record Employee(String name, int age, String job) {
}

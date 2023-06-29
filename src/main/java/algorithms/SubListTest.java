package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubListTest {

    public static void main(String[] args) {
        var names = new ArrayList<>(List.of("kamar", "baraka", "kombe", "kahindi"));
        var updatedNames = List.of("kamar", "baraka", "kahindi");
        System.out.println(names);
        names.retainAll(updatedNames);
        System.out.println(names);

        var numbers = new LinkedList<>(List.of(1, 2, 3, 4));
        var numbers1 = new LinkedList<>(List.of(5, 6, 7, 8));
        numbers.addAll(numbers1);

        System.out.println(numbers);

        numbers1.subList(1, numbers1.size()).clear();
        System.out.println(numbers1);

        var arr = new String[] {"kamar", "baraka", "kombe"};
        System.out.println(arr.getClass().getSimpleName());
        List<String> arrList = List.of(arr);
        System.out.println(arrList.getClass().getSimpleName());

        var arrBack = arrList.toArray(String[]::new);
        System.out.println(arrBack.getClass().getSimpleName());

        List<?> wild = new ArrayList<>();

    }

    public static <T> void capture(T obj){

    }
}

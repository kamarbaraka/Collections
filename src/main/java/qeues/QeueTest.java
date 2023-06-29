package qeues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class QeueTest {

    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        queue.addAll(List.of("kamar", "baraka", "kahindi"));
        queue.add("katore");
        queue.addFirst("kwanza");
        queue.offer("samson");
        queue.push("samidoh");
        System.out.println(queue.getFirst());
    }
}

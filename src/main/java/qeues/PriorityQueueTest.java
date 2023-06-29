package qeues;

import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        var pq = new PriorityQueue<String>();
        pq.addAll(List.of("welcome", "this is", " a test for ", "priority queues"));

        System.out.println("iterating over the elements...");
        pq.forEach(System.out::println);
        System.out.println("removing elements...");
        while (!pq.isEmpty()) System.out.println(pq.remove());
        System.out.println(pq);
    }
}

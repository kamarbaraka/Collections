package algorithms.legacycollections;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        var stack = new Stack<String>();
        stack.push("kamar");
        stack.push("baraka");
        stack.pop();

        System.out.println(stack);
    }
}

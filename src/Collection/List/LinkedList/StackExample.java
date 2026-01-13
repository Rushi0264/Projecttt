package Collection.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class StackExample
{
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack : "+stack);
        System.out.println("Popped : "+stack.pop());
        System.out.println("After pop : "+stack);
    }
}

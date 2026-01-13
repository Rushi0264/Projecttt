package Collection;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(20);
        num.add(10);
        num.add(40);

        System.out.println("Sorted : "+num);
    }
}

package Collection.List.ArrayList;

import java.util.ArrayList;

public class PrintElementReverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pineapple");
        System.out.println("Original list : "+list);

        System.out.print("Reversed list :");
        for (int i=list.size()-1;i>=0;i--) {
            System.out.print(" "+list.get(i));
        }
    }
}

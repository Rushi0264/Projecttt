package Collection.List.ArrayList;

import java.util.ArrayList;

public class ReplaceTheElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        System.out.println(list);
        list.set(1,"Apple");
        System.out.println(list);
    }
}

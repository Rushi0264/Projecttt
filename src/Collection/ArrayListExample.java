package Collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.print("Fruit list :");
        for (String fruits : list){
            System.out.print(" "+fruits);
        }
    }
}

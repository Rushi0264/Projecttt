package Collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()){
            String element = itr.next();
            System.out.println(element);
        }
    }
}

package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListInDescendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(89);
        list.add(44);
        list.add(23);
        list.add(51);
        list.add(11);
        System.out.println("Before sorting : "+list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After sorting (Descending) : "+list);
    }
}

package Collection.List.ArrayList;

import java.util.ArrayList;

public class InsertElementAtSpecificIndex
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("JS");
        list.add("C++");
        System.out.println(list);
        list.add(2,"C");
        System.out.println(list);
    }
}

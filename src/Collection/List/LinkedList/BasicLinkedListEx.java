package Collection.List.LinkedList;

import java.util.LinkedList;

public class BasicLinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Latur");
        cities.add("Nanded");
        System.out.println(cities);

        cities.add(1,"Beed");
        System.out.println(cities);

        System.out.println("First city : "+cities.getFirst());
        System.out.println("Last city : "+cities.getLast());
    }
}

package Collection.Comparator;

import java.util.*;

class Students {
    int roll;
    String name;

    Students(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return roll + " " + name;
    }
}

public class AnonymousComparatorShort {
    public static void main(String[] args) {

        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students(3, "Rushi"));
        list.add(new Students(1, "Shubham"));
        list.add(new Students(2, "Sumit"));

        Collections.sort(list, new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                return s1.roll - s2.roll;
            }
        });

        System.out.println(list);
    }
}
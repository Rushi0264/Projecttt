package Collection.Comparator;

import java.util.*;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return "Student{roll=" + roll + ", name='" + name + "'}";
    }
}

class RollComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.roll - s2.roll;
    }
}

class NameComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit"));
        list.add(new Student(1, "Rushi"));
        list.add(new Student(2, "Neha"));

        Collections.sort(list, new RollComparator());
        System.out.println(list);
        System.out.println("===========================================================================================");

        Collections.sort(list, new NameComparator());
        System.out.println(list);

    }
}

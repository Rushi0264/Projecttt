package Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    private int rollNo;
    private String name;

    Student(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student : {" +
                " Name : " +name+
                " Roll no : "+rollNo+
                "}";
    }

    @Override
    public int compareTo(Student s){
        return this.rollNo - s.rollNo;
    }
}

public class StudentSort {
    public static void main(String[] args) {
        Student s1 = new Student(11,"Rushi");
        Student s2 = new Student(15,"Omkar");
        Student s3 = new Student(13,"Shiv");
        Student s4 = new Student(14,"Shubham");
        Student s5 = new Student(12,"Gaurav");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("Before Sort : "+list);

        Collections.sort(list);
        System.out.println("After Sort : "+list);
        /*for (Student s : list){
            System.out.println(s);
        }*/
    }
}

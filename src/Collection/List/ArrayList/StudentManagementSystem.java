package Collection.List.ArrayList;

import java.util.ArrayList;

public class StudentManagementSystem {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Amit");
        students.add("Sneha");
        students.add("Om");
        students.add("Rushi");
        students.add("Avi");

        System.out.println("Student list : "+students);

        System.out.println("First student : "+students.get(0));

        students.set(1,"Snehal");
        System.out.println("Student list after update : "+students);

        students.remove("Amit");
        System.out.println("Student list after remove : "+students);

        System.out.println("Total students : "+students.size());

        System.out.println("List of students : ");
        for (String s : students){
            System.out.println(s);
        }
    }
}




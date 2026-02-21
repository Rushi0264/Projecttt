package Java_8.Functional_Interface.Basic;

import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;
    double percentage;
    String specialization;

    Student(int id, String name, double percentage, String specialization){
        this.id=id;
        this.name=name;
        this.percentage=percentage;
        this.specialization=specialization;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String toString(){
        return id+"-"+name+"-"+percentage+"-"+specialization;
    }
}

public class StudentDetail {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(11, "Omkar",   77.0, "Mathematics"));
        studentList.add(new Student(12, "Sumit",   87.4, "Science"));
        studentList.add(new Student(13, "Anuj",    84,   "Politics"));
        studentList.add(new Student(14, "Mahesh",  67,   "Sport"));
        studentList.add(new Student(15, "Pradeep", 83.5, "Computers"));
        studentList.add(new Student(16, "Xing",    58.5, "Geography"));
        studentList.add(new Student(17, "Ajay",    72.6, "Banking"));
        studentList.add(new Student(18, "Sunil",   86.7, "History"));
        studentList.add(new Student(19, "Ajit",    58.6, "Finance"));
        studentList.add(new Student(20, "Sneha",   89.8, "Computers"));

        for (Student s :studentList){
            System.out.println(s);
        }
    }
}

package Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    private int studentId;
    private String studentName;
    private String studentEmail;
    private String studentDept;

    Student(int studentId, String studentName, String studentEmail, String studentDept){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentEmail=studentEmail;
        this.studentDept=studentDept;
    }

    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(){
        this.studentId=studentId;
    }

    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(){
        this.studentName=studentName;
    }

    public String getStudentEmail(){
        return studentEmail;
    }
    public void setStudentEmail(){
        this.studentEmail=studentEmail;
    }

    public String getStudentDept(){
        return studentDept;
    }
    public void setStudentDept(){
        this.studentDept=studentDept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student Id =" + studentId +
                ", Student Name ='" + studentName + '\'' +
                ", Student Email ='" + studentEmail + '\'' +
                ", Student Department ='" + studentDept + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s){
        return this.getStudentId()-s.studentId;
    }

    public static void main(String[] args) {
        Student om = new Student(5,"Omkar","omkar@gmail.com","Computer Science");
        Student rushi = new Student(3,"Rushikesh","rushikesh@gmail.com","Computer Science");
        Student shubham = new Student(1,"Shubham","shubham@gmail.com","B-Com");
        Student gaurav = new Student(4,"Gaurav","gaurav@gmail.com","Art");
        Student ajay = new Student(2,"Ajay","ajay@gmail.com","Biotech");

        List<Student> studentList = new ArrayList<>();
        studentList.add(om);
        studentList.add(rushi);
        studentList.add(shubham);
        studentList.add(gaurav);
        studentList.add(ajay);

        System.out.println("Before sorting : " + studentList);

        Collections.sort(studentList);
        System.out.println("After Sorting : "+studentList);
    }
}

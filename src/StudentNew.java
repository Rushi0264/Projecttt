public class StudentNew {

    String name;
    int rollNo;
    int marks;
    StudentNew(String name, int rollNo, int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    @Override
    public String  toString(){
        return "Student name : "+name+"\nRoll no : "+rollNo+"\nMarks : "+marks;
    }

    public static void main(String[] args) {
        StudentNew obj = new StudentNew("Rushi",10,80);
        System.out.println(obj);

        StudentNew obj1 = new StudentNew("Soham",86,87);
        System.out.println(obj1);
    }
}

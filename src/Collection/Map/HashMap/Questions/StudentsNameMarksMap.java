package Collection.Map.HashMap.Questions;
//Given a studentNameMarksMap having name of students as keys and their marks in mathematics as values,
//give required grace marks and pass those students who have scored above 30. Passing marks is 35?

import java.util.HashMap;

public class StudentsNameMarksMap {
    public static void main(String[] args) {
        HashMap<String, Integer> studentsNameMarks = new HashMap<>();
        studentsNameMarks.put("Aditya Sen", 57);
        studentsNameMarks.put("Harris Brar", 34);
        studentsNameMarks.put("Sarah Amin", 61);
        studentsNameMarks.put("Rishika Gowda", 75);
        studentsNameMarks.put("Rohit Gupta", 68);
        studentsNameMarks.put("Andriel Hope", 31);
        studentsNameMarks.put("Deepti Sharma", 81);
        studentsNameMarks.put("Irfan Ali", 33);
        studentsNameMarks.put("Ruth Prabhu", 66);
        studentsNameMarks.put("Arun Trivedi", 29);

        System.out.println("Before update");
        System.out.println("-------------------------------------------------------------");
        studentsNameMarks.forEach((key, value) -> System.out.println(key+" : "+value));
        System.out.println();

        studentsNameMarks.replaceAll((key, value) -> {
            if (value < 35 && value>=30){
                value = value + (35 - value);
                return value;
            }
            return value;
        });
        System.out.println("After update");
        System.out.println("-------------------------------------------------------------");
        studentsNameMarks.forEach((key, value) -> System.out.println(key+" : "+value));
    }
}

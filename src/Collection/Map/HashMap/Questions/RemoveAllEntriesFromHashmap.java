package Collection.Map.HashMap.Questions;

import java.util.HashMap;

//9) How do you remove all the entries from a HashMap at a time?
public class RemoveAllEntriesFromHashmap {
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

        //size of hashmap before remove all entries
        System.out.println(studentsNameMarks.size());

        //size of hashmap after remove all entries
        studentsNameMarks.clear();
        System.out.println(studentsNameMarks.size());
    }
}

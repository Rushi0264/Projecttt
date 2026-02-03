package Collection.Map.HashMap.Questions;
//7) How do you update an existing value of a key with a new value in a HashMap?

import java.util.HashMap;

public class ReplaceValueInHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentIdName = new HashMap<>();
        studentIdName.put(101,"Omkar");
        studentIdName.put(102,"Rushi");
        studentIdName.put(103,"Avinash");
        studentIdName.put(104,"Sumit");
        studentIdName.put(105,"Shubham");

        studentIdName.replace(104,"Gaurav");
        studentIdName.replace(103,"Avinash","Sai");

        studentIdName.forEach((key, value) -> System.out.println(key+" : "+value));
    }
}

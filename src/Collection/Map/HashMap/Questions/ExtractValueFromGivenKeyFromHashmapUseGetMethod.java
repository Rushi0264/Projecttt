package Collection.Map.HashMap.Questions;

import java.util.HashMap;

//5) How do you extract a value associated with a given key from a HashMap?
public class ExtractValueFromGivenKeyFromHashmapUseGetMethod {
    public static void main(String[] args) {
        HashMap<Integer, String> studentIdName = new HashMap<>();
        studentIdName.put(101,"Omkar");
        studentIdName.put(102,"Rushi");
        studentIdName.put(103,"Avinash");
        studentIdName.put(104,"Sumit");
        studentIdName.put(105,"Shubham");

        System.out.println(studentIdName.get(104));//Sumit
        System.out.println(studentIdName.get(106));//null
    }
}

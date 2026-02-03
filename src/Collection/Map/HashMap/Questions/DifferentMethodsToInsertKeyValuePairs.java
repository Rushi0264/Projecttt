package Collection.Map.HashMap.Questions;
//2) What are the different methods to insert key-value pairs into a HashMap?

import java.util.HashMap;

public class DifferentMethodsToInsertKeyValuePairs {
    public static void main(String[] args) {
        HashMap<Integer, String> studentIdName = new HashMap<>();
        studentIdName.put(101,"Omkar");
        studentIdName.put(102,"Rushi");
        studentIdName.put(103,"Avinash");
        studentIdName.put(104,"Sumit");
        studentIdName.put(105,"Shubham");

        System.out.println("=============Student Information============");
        System.out.println("--------------------------------------------");

        studentIdName.forEach((key, value) -> System.out.println(key+" : "+value));
        System.out.println();

        //Create another hashmap
        HashMap<Integer, String> anotherStudentIdName = new HashMap<>();
        anotherStudentIdName.put(106,null);
        anotherStudentIdName.put(107,"Gaurav");

        //Inserting all mappings of studentIdName into anotherStudentIdName using putAll() method
        anotherStudentIdName.putAll(studentIdName);

        //Inserting key-value pair into anotherStudentIdName using putIfAbsent() method
        anotherStudentIdName.putIfAbsent(107,"Poonam");
        anotherStudentIdName.putIfAbsent(108,"Anushka");

        System.out.println("Another student information");
        System.out.println("--------------------------------------------");
        anotherStudentIdName.forEach((key, value) -> System.out.println(key+" : "+value));
    }
}

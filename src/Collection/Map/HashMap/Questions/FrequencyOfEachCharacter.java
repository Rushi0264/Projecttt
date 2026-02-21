package Collection.Map.HashMap.Questions;

import java.util.HashMap;

//11) Find the frequency of each element of an array using HashMap?
public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        HashMap<Character, Integer> elementFrequencyMap = new HashMap<>();
        for (char c : inputString.toCharArray()){
            if (c != ' '){
                elementFrequencyMap.put(c, elementFrequencyMap.getOrDefault(c,0)+1);
            }
        }

        System.out.println("Input String : "+inputString);
        elementFrequencyMap.forEach((key, value) -> System.out.println(key+" : "+value));
    }
}

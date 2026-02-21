package Collection.Map.HashMap.Questions;

import java.util.Arrays;
import java.util.HashMap;
//11) Find the frequency of each element of an array using HashMap?

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 1, 7, 1, 4, 7, 8};

        HashMap<Integer, Integer> elementFrequencyMap = new HashMap<>();
        for (int i : arr){
            elementFrequencyMap.put(i, elementFrequencyMap.getOrDefault(i, 0)+1);
        }

        System.out.println("input array : "+ Arrays.toString(arr));
        System.out.println("Element frequency ");
        elementFrequencyMap.forEach((key, value) -> System.out.println(key+" : "+value));
    }
}

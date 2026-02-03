package Collection.Map.HashMap.Questions;
//12) How do you find the most frequent element or second most frequent element or
// top 3 most frequent elements in an array using HashMap?

import java.util.*;

public class FindTheTopThreeMostFrequentElements {
    public static void main(String[] args) {
        int[] inputArray = {4, 7, 2, 9, 1, 7, 1, 4, 7, 8};

        //Creating an empty elementFrequencyMap with elements as keys and their frequency as values

        HashMap<Integer, Integer> elementFrequencyMap = new HashMap<Integer, Integer>();

        //Iterating each element of inputArray

        for (int i : inputArray)
        {
            //Inserting each element of inputArray into elementFrequencyMap
            //If element is already present, incrementing its count by 1

            elementFrequencyMap.put(i, elementFrequencyMap.getOrDefault(i, 0) + 1);
        }

        //Printing inputArray

        System.out.println("Input Array : "+ Arrays.toString(inputArray));
        System.out.println("================================");

        //Most frequent element of inputArray

        Optional<Map.Entry<Integer, Integer>> mostFrequentElement = elementFrequencyMap.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println("Most Frequent Element");
        System.out.println(mostFrequentElement.get().getKey()+" : "+mostFrequentElement.get().getValue());

        //Second most frequent element of inputArray

        System.out.println("Second Most Frequent Element");

        elementFrequencyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(2)
                .skip(1)
                .forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));

        //Top 3 most frequent elements of inputArray

        System.out.println("Top 3 Most Frequent Elements");

        elementFrequencyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
    }
}
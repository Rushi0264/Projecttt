package IntroToArray;

import org.w3c.dom.ls.LSOutput;

public class FindTheLargestAndSmallestElement {
    public static void main(String[] args) {
        int[] arr = {1,4,5,4,6,11,77,8,9,10,44,78,77,44};
        int small=arr[0];
        int large=arr[0];

        for (int i=0; i< arr.length; i++){
            if (arr[i] > large){
                large = arr[i];
            } else if (arr[i] < small) {
                    small = arr[i];
                }
            }
        System.out.println(large);
        }
}

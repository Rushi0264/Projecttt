package Revision;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] arr= {2,4,6,7,4,9};
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element in this array is : "+max);
    }
}

package Collection.List.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1,0,1};
        System.out.println("Binary search before sorting :");

        for (int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }

        int i=0, j= arr.length-1;

        while (i < j){
            if (arr[i] > arr[j]){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j++;
            } else if (arr[i] == 0 && arr[j] == 0) {
                i++;
            } else if (arr[i] == 1 && arr[j] == 1) {
                j--;
            } else if (arr[i] < arr[j]) {
                i++;
                j--;
            }
        }

        System.out.println("\nBinary search after sorting : ");
        for (int i1 = 0; i1 < arr.length; i1++){
            System.out.print(" "+arr[i1]);
        }
    }
}

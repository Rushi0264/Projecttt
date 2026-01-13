package Collection.List.ArrayList;

public class FindPositionFromWhichSortedArrayRotated {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};

        System.out.println("Array before rotate :");
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

        for (int i=0;i<arr.length;i++){
            if (i+1 == arr.length){
                System.out.println("\nArray cant rotate..!");
            }
            else {
                if (arr[i] > arr[i+1]){
                    System.out.println("\nArray has been rotated from "+(i+1)+" position");
                    break;
                }
            }
        }
    }
}

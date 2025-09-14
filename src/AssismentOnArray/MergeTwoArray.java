package AssismentOnArray;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] merged =new int[arr1.length + arr2.length];

        System.out.print("Array 1 before merged : ");
        for (int i=0; i< arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.print("\nArray 2 before merged : ");
        for (int i=0; i< arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        for (int i=0; i< arr1.length; i++){
            merged[i] = arr1[i];
        }
        for (int i=0; i<arr2.length; i++){
            merged[arr1.length + i] = arr2[i];
        }

        System.out.print("Merged array is : ");
        for (int i=0; i< merged.length; i++){
            System.out.print(merged[i]+" ");
        }
    }
}

package AssismentOnArray;

public class SortAscendingDescending {
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,5,4,7,9,8,10};
        int temp=0;

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
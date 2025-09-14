package AssismentOnArray;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={22,22,33,33,4,5,6,77,88,77};

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}

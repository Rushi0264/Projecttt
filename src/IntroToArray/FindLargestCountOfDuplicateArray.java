package IntroToArray;

public class FindLargestCountOfDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {3,7,6,1,5,8,5,8,9,2,7,9,4,7};
        int temp[] =new int[arr.length];
        int max;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    temp[i]=arr[j];
                    System.out.println(arr[i]);
                }
            }
        }

        max=temp[0];
        for (int i=0;i<temp.length; i++){
            if (temp[i] > max){
                max = temp[i];
            }
        }
       // System.out.println("Count : "+max);
        for (int i=0; i<max; i++){

        }

    }
}

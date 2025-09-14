package P1;

public class FindDuplicate {
    protected void showArr(){
        int[] arr = {3,5,6,3,5,6,7,8,9,1,2,10};
        for (int i=0; i< arr.length;i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}

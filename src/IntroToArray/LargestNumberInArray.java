package IntroToArray;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int largeArray[] = {3,4,5,6,7,2,8,9,4,5,66};
        int max = largeArray[0];

        for(int i =0 ; i<largeArray.length; i++){
            if (largeArray[i] > max ){
                max = largeArray[i];
            }
        }
        System.out.println(max);
    }
}

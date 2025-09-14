package IntroToArray.SmallAndLargeNumberInArray;

public class LargeNumArray3 {
    public static void main(String[] args) {
        int largeArr[] = {3,5,7,2,9,1};
        int max = largeArr[0];

        for (int i=0; i< largeArr.length; i++){
            if (largeArr[i] > max){
                max = largeArr[i];
            }
        }
        System.out.println(max);
    }
}

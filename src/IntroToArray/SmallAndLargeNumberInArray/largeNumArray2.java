package IntroToArray.SmallAndLargeNumberInArray;

public class largeNumArray2 {
    public static void main(String[] args) {
        int largeArr[] = {23,42,12,45,55,76};
        int max = largeArr[0];

        for(int i=0; i< largeArr.length; i++){
            if (largeArr[i] > max){
                max = largeArr[i];
            }
        }
        System.out.println(max);
    }
}

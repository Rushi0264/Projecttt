package IntroToArray.SmallAndLargeNumberInArray;

public class LargeNumArray1 {
    public static void main(String[] args) {
        int largeArr [] = {34,54,24,53,43};
        int max = largeArr[0];

        for (int i=0; i<largeArr.length; i++){
            if (largeArr[i] > max){
                max = largeArr[i];
            }
        }
        System.out.println(max);
    }
}

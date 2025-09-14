package IntroToArray.SmallAndLargeNumberInArray;

public class LargeNumArray4 {
    public static void main(String[] args) {
        int largeArr[] = {543,567,345,886,987};
        int max = largeArr[0];

        for (int i=0; i<largeArr.length; i++){
            if (largeArr[i] > max){
                max = largeArr[i];
            }
        }
        System.out.println(max);
    }
}

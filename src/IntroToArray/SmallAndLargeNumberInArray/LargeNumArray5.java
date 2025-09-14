package IntroToArray.SmallAndLargeNumberInArray;

public class LargeNumArray5 {
    public static void main(String[] args) {
        int largeArr[] = {4321,6556,7654,7890,3455};
        int max = largeArr[0];

        for (int i=0; i< largeArr.length; i++){
            if (largeArr[i] > max){
                max = largeArr[i];
            }
        }
        System.out.println(max);
    }
}

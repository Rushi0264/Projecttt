package IntroToArray.SmallAndLargeNumberInArray;

public class SmallNumInArray1 {
    public static void main(String[] args) {
        int smallNum[] = {3,6,2,8,6,1};
        int min=smallNum[0];
        for (int i= 0; i<smallNum.length; i++){
            if (smallNum[i] < min){
                min = smallNum[i];
            }
        }
        System.out.println(min);
    }
}

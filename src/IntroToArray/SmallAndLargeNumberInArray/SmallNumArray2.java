package IntroToArray.SmallAndLargeNumberInArray;

public class SmallNumArray2 {
    public static void main(String[] args) {
        int smallArray[] = {7,5,8,9};
        int min = smallArray[0];

        for (int i=0; i<smallArray.length; i++){
            if (smallArray[i] < min){
                min = smallArray[i];
            }
        }
        System.out.println(min);
    }
}

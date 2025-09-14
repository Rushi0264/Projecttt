package IntroToArray.SmallAndLargeNumberInArray;

public class SmallNumArray3 {
    public static void main(String[] args) {
        int smallArr[] = {99,89,55,66,34};
        int min = smallArr[0];

        for (int i=0; i<smallArr.length; i++){
            if (smallArr[i] < min){
                min = smallArr[i];
            }
        }
        System.out.println("Smallest value in this array : "+min);
    }
}

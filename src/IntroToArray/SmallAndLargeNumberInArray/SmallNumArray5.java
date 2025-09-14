package IntroToArray.SmallAndLargeNumberInArray;

public class SmallNumArray5 {
    public static void main(String[] args) {
        int smallArray[] = {233,654,86,345,98,67};
        int min = smallArray[0];

        for (int i=0; i< smallArray.length; i++){
            if(smallArray[i] < min){
                min = smallArray[i];
            }
        }
        System.out.println(min);
    }
}

package IntroToArray.SmallAndLargeNumberInArray;

public class SmallNumArray6 {
    public static void main(String[] args) {
        int smallArray[] = {3443,4543,6543,8764,2312,2313};
        int min = smallArray[0];

        for (int i=0; i< smallArray.length; i++){
            if (smallArray[i] < min){
                min = smallArray[i];
            }
        }
        System.out.println(min);
    }
}

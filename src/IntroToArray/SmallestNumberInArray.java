package IntroToArray;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int smallArray[] = {1,4,5,6,7,3,9,0};
        int min = smallArray[0];

        for (int i=0; i< smallArray.length; i++){
           if (smallArray[i] < min){
               min = smallArray[i];
           }
        }
        System.out.println(min);
    }
}

package IntroToArray;

public class SumOfAllElementsInArray {
    public static void main(String[] args) {
        int array[] = {3,2,6,9,10,1,4,8,5,7};
        int num=0;
        for (int i=0;i< array.length;i++){
            num = num + array[i];
        }
        System.out.println("Addition of Array : "+num);
    }
}

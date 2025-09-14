package IntroToArray;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int array[] = {3,4,5,6,7,2,8,9,1,10};
        for (int i=0; i<array.length; i++){
            for (int j=0; j< array.length; j++){
                if (array[i] > array[j]){
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println("Reverse array element : "+array[i]);
        }
    }
}

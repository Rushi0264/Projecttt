package IntroToArray;

public class ReverseAnArray2ndWay {
    public static void main(String[] args) {
        int array[] = {9, 10, 2, 4, 5, 7, 1, 3, 6, 8};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Reverse array : " + array[i]);
        }
    }
}

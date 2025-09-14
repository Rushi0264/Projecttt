package IntroToArray.CopyArray;

public class CopyArray6 {
    public static void main(String[] args) {
        int arr[] = {90,9};
        int copyArr[] = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            copyArr[i] = arr[i];
        }

        for (int i=0; i<copyArr.length; i++){
            System.out.println(copyArr[i]);
        }
    }
}

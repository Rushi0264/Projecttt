package IntroToArray.CopyArray;

public class CopyArray5 {
    public static void main(String[] args) {
        int arr[] = {3,4,5};
        int copyArr[] = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            copyArr[i] = arr[i];
        }

        for (int i=0; i<copyArr.length; i++){
            System.out.println("Array copied : "+copyArr[i]);
        }
    }
}

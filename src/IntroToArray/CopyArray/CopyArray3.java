package IntroToArray.CopyArray;

public class CopyArray3 {
    public static void main(String[] args) {
        int arr[] = {2,545,6,3,2,45,4};
        int copyArr[] = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            copyArr[i] = arr[i];
        }

        for (int i=0; i<copyArr.length; i++){
            System.out.println(copyArr[i]);
        }
    }
}

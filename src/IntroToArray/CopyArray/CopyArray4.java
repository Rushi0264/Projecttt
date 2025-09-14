package IntroToArray.CopyArray;

public class CopyArray4 {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,3,3};
        int cpArr[] = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            cpArr[i] = arr[i];
        }

        for (int i=0; i<cpArr.length; i++){
            System.out.println(cpArr[i]);
        }
    }
}

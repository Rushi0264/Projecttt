package IntroToArray.CopyArray;

public class CopyArray1 {
    public static void main(String[] args) {
        int arr[] = {43,543,64,45};
        int newArr[] = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            newArr[i] = arr[i];
        }

        for (int i=0; i< newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}

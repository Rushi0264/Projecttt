package IntroToArray.SmallAndLargeNumberInArray;

public class LargeNumArrayCallingMethod {
    void array1(){
        int arr[] = {3445,534,5342,54566};
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number in array1 : "+max);
    }

    void array2(){
        int arr[] = {4535,4534,43355,7654};
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number in array2 : "+max);
    }

    void array3(){
        int arr[] = {4242,6785,8643,6775};
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number in array3 : "+max);
    }

    public static void main(String[] args) {
        LargeNumArrayCallingMethod obj = new LargeNumArrayCallingMethod();
        obj.array1();
        obj.array2();
        obj.array3();
    }
}

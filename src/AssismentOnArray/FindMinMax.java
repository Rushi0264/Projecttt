package AssismentOnArray;

public class FindMinMax {
    FindMinMax(){
        int[] arr={3,5,6,2,7,9};
        int max=arr[0];
        int min=arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
    }

    public static void main(String[] args) {
        FindMinMax obj = new FindMinMax();
    }
}

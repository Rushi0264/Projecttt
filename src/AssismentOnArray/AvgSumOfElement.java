package AssismentOnArray;

public class AvgSumOfElement {
    public static void main(String[] args) {
        int[] arr={20,30,40,50,90};
        int sum=0;

        for (int i=0; i< arr.length; i++){
            sum +=arr[i];
        }
        System.out.println(sum);

        double avg = sum/arr.length;
        System.out.println(avg);
    }
}

package AssismentOnArray;

public class PercentageOfZeroPositiveNegative {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,-3,5,7,8,0};

        int total=arr.length;
        int positive=0;
        int negative=0;
        int zero=0;

        for (int i=0; i<total; i++){
            if (arr[i] > 0){
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }
        double posPer = (positive * 100.0) / total;
        double negPer = (negative * 100.0) / total;
        double zeroPer = (zero * 100.0) / total;

        System.out.println("Total elements: " + total);
        System.out.println("Positive numbers: " + positive + " (" + posPer + "%)");
        System.out.println("Negative numbers: " + negative + " (" + negPer + "%)");
        System.out.println("Zeroes: " + zero + " (" + zeroPer + "%)");
    }
}

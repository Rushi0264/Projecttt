package Revision;

import java.util.Scanner;

public class SumOfAllElementInArray {
    SumOfAllElementInArray(){
        Scanner sc = new Scanner(System.in);
            int[] arr = {2, 4, 5, 7, 8};
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
    }

    public static void main(String[] args) {
        SumOfAllElementInArray obj = new SumOfAllElementInArray();
    }
}

package Revision;

public class EvenOddCountArray {
    public static void main(String[] args) {
        int[] arr = {22,33,12,54,67,87};
        int[] ans = new int [arr.length];
        int odd = 0, even = 0;
        for (int num =1; num<= arr.length; num++) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even count : "+even);
        System.out.println("Odd count : "+odd);
    }
}

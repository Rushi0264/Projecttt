package P1;

import java.util.Scanner;

public class evenOdd {
    protected void show(){
        System.out.println("Enter number to check even or odd : ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("Entered number is even..");
        } else if (a%2!=0) {
            System.out.println("Entered number is odd..");
        }else {
            System.out.println("Input is invalid");
        }
    }
}

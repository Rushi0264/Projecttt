package Loops.WhileLoop;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");
        int num= sc.nextInt();
        int fact = 1;
        while(num>0){
            fact *= num;
            num--;
        }
        System.out.println(fact);
    }
}

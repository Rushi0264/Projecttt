package P1;

import java.util.Scanner;

public class Simple {

    int a,b;
    protected void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values for addition : ");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition of a and b : "+c);
    }

    protected void sub(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values for subtraction : ");
        a=sc.nextInt();
        b=sc.nextInt();
        int c = a-b;
        System.out.println("Subtraction of a and b : "+c);
    }
}

package AllInOne;

import java.util.Scanner;

public class TryAllBasicProgramUsingMethod {
    void Arithmatic(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers for arithmatic operations : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition : "+(a+b));
        System.out.println("Subtraction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(a/b));
        System.out.println("Modules : "+(a%b));
        System.out.println();
    }

    void logicalAnd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for check less or greater : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a<b && a<=b){
            System.out.println("A is less than either equal..!");
        } else if (b<a && b<=a) {
            System.out.println("B is less than either equal..!");
        }
        else {
            System.out.println("Input is not valid..!");
        }
        System.out.println();
    }

    void logicalOr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for check equality: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b || a<b){
            System.out.println("Condition is true");
        }
        else {
            System.out.println("condition will be false");
        }
        System.out.println();
    }

    void ifelse(){
        int arr[] ={1,2,3,4,5,6,7,8};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number : ");
        arr[0] = sc.nextInt();

            if (arr[0]==1){
                System.out.println("Monday..!");
            } else if (arr[0] ==2) {
                System.out.println("Tuesday..!");
            } else if (arr[0] == 3) {
                System.out.println("Wednesday..!");
            } else if (arr[0] == 4) {
                System.out.println("Thursday..!");
            } else if (arr[0] == 5) {
                System.out.println("Friday..!");
            } else if (arr[0] == 6) {
                System.out.println("Saturday..!");
            } else if (arr[0] == 7) {
                System.out.println("Sunday..!");
            } else if (arr[0] >=8) {
                System.out.println("Input is invalid..!");
            }
        System.out.println();
    }

    void switchcase() {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number between 1 to 12 : ");
        month = sc.nextInt();
        String runningMonth = "";

        switch (month) {
            case 1:
                runningMonth += "January";
                break;
            case 2:
                runningMonth += "Feb";
                break;
            case 3:
                runningMonth += "March";
                break;
            case 4:
                runningMonth += "April";
                break;
            case 5:
                runningMonth += "May";
                break;
            case 6:
                runningMonth += "June";
                break;
            case 7:
                runningMonth += "July";
                break;
            case 8:
                runningMonth += "August";
                break;
            case 9:
                runningMonth += "September";
                break;
            case 10:
                runningMonth += "October";
                break;
            case 11:
                runningMonth += "November";
                break;
            case 12:
                runningMonth += "December";
                break;
            default:
                System.out.println("Invalid month number..!");
        }
        if (month <= 12) {
            System.out.println("Running month is " + runningMonth);
        }
    }

    void table(){
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }

    void duplicateNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();  // Taking size of the array

        int[] numbers = new int[size];  // Declare the array

        // Taking input elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i=0; i<numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]){
                    System.out.println("Duplicate number in this array is : "+numbers[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        TryAllBasicProgramUsingMethod obj = new TryAllBasicProgramUsingMethod();
        obj.Arithmatic();
        obj.logicalAnd();
        obj.logicalOr();
        obj.ifelse();
        obj.switchcase();
        obj.table();
        obj.duplicateNum();
    }
}

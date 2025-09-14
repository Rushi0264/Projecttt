package Revision;

import java.util.Scanner;

public class RunningMonth {

    RunningMonth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check running month : ");
        int month = sc.nextInt();
        String thisMonth;

        switch (month){
            case 1:
                thisMonth = "January";
                break;

            case 2:
                thisMonth = "February";
                break;

            case 3:
                thisMonth = "March";
                break;

            case 4:
                thisMonth = "April";
                break;

            case 5:
                thisMonth = "May";
                break;

            case 6:
                thisMonth = "June";
                break;

            case 7:
                thisMonth = "July";
                break;

            case 8:
                thisMonth = "August";
                break;

            case 9:
                thisMonth = "September";
                break;

            case 10:
                thisMonth = "October";
                break;

            case 11:
                thisMonth = "November";
                break;

            case 12:
                thisMonth = "December";
                break;

            default:
                thisMonth = "Not valid..!";
        }
        if (month>=1 && month<=12) {
            System.out.println("Running month is : " + thisMonth);
        }
        else {
            System.out.println("This month is "+thisMonth);
        }
    }

    public static void main(String[] args) {
        RunningMonth obj = new RunningMonth();
    }
}

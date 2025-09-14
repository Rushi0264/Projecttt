package Loops.WhileLoop;
import java.util.Scanner;

public class AtmPinCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 12345;
        int userPin, withdraw, addAmount;
        int attempt=0;
        int maxAttempt = 3;
        int accountBalance=3000;

        while (attempt < maxAttempt){
            System.out.println("Enter your ATM Pin : ");
            userPin = sc.nextInt();

            if (userPin == correctPin){
                System.out.println("Entered Pin is correct. Welcome!");
                System.out.println("Avaliable Balance is : "+accountBalance);
                System.out.println("Enter amount for withdraw : ");
                withdraw =sc.nextInt();
                //System.out.println("Withdraw successful..!"+withdraw);

                int balAfterWithdraw =accountBalance-withdraw;
                if (withdraw>accountBalance){
                    System.out.println("Insufficient balance..!");
                }else {
                    System.out.println("Withdraw successful..!"+withdraw);
                    System.out.println("Avaliable balance after withdraw : " + balAfterWithdraw);
                }

                System.out.println("Add amout = ");
                addAmount = sc.nextInt();
                System.out.println("Added successful..!"+addAmount);
                System.out.println("Avaliable balance after add amount : "+(balAfterWithdraw+addAmount));
                break;
            }

            if (userPin != correctPin){
                attempt++;
                System.out.println("Incorrect pin..!"+(maxAttempt-attempt));
            }
        }
        if (attempt == maxAttempt){
            System.out.println("Sorry\nTry after 48 hours..!");
        }
    }
}

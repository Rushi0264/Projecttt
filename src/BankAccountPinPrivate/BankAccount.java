package BankAccountPinPrivate;

import java.util.Scanner;

public class BankAccount {
    private int pin;

    private void checkPin(){
        Scanner sc = new Scanner(System.in);
        pin = sc.nextInt();
        if (pin==1234) {
            System.out.println("Verifying Pin.!");
        }
        else {
            System.out.println("Incorrect pin..");
        }
    }

    public void withdrawMoney(){
        checkPin();
        if (pin==1234) {
            System.out.println("Withdraw Successfully..");
        }
        else {
            System.out.println("Sorry\nWithdraw not possible..");
        }
    }
}

package Interface;

import java.util.Scanner;

interface Payment{
    void pay();
}

class ChooseUPI implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment done using UPI..!");
    }
}

class ChooseNetBanking implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment done using Net banking..!");
    }
}

class PaymentCheckout{
    void payment(Payment payment){
        payment.pay();
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentCheckout obj = new PaymentCheckout();

        System.out.println("Choose option for payment :");
        System.out.println("1: UPI.");
        System.out.println("2: Net Banking.");
        System.out.print("Enter your option : ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                obj.payment(new ChooseUPI());
                break;

            case 2:
                obj.payment(new ChooseNetBanking());
                break;

            default:
                System.out.println("Invalid choice..!");
        }

    }
}

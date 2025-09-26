package Interface;

interface Bank{
    void deposit(double amount);
    void withdraw(double amount);
}

class SBI implements Bank{
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    @Override
    public void deposit(double amount){
        //deposit=balance+amount;
        if (amount > 0) {
            balance+=amount;
            System.out.println("Deposited amount is : " + amount);
            System.out.println("Balance after deposit : "+balance);
        } else {
            System.out.println("Invalid input..!");
        }
    }

    @Override
    public void withdraw(double amount){
        //withdraw=deposit-amount;
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawable amount is : " + amount);
                System.out.println("Balance after withdraw : " + balance);
            } else {
                System.out.println("Insufficient balance..!");
            }
        }
    }
}

public class TestBankAccount {
    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.setBalance(5000);
        System.out.println("Account balance is : "+obj.getBalance());
        obj.deposit(100);
        obj.withdraw(4000);
    }
}

package Interface;

interface Bank{
    void deposit(double amount);
    void withdraw(double amount);
}

class SBI implements Bank{
    private double balance;
    private long accNum;
    private String holderName;

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

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
        obj.setHolderName("Rushikesh");
        obj.setBalance(5000);
        System.out.println("Account Holder Name : "+obj.getHolderName());
        System.out.println("Account balance is : "+obj.getBalance());
        obj.deposit(100);
        obj.withdraw(4000);
        System.out.println("--------------------------------------------------------------------------");

        SBI obj1 = new SBI();
        obj1.setHolderName("Shubham");
        obj1.setBalance(10000);
        System.out.println("Account Holder Name : "+obj1.getHolderName());
        System.out.println("Account balance is : "+obj1.getBalance());
        obj1.deposit(100);
        obj1.withdraw(4000);
        System.out.println("--------------------------------------------------------------------------");
    }
}

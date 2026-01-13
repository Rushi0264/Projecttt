package Threading.MultiThreading.Synchronization;

class Account {

    private int balance;

    public Account(int balance){
        System.out.println("Current Account Balance : "+balance);
        this.balance = balance;
    }

    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient balance | Balance: " + balance);
        }
    }
}


class DepositThread extends Thread{
    Account acc;
    int amount;

    DepositThread(Account acc, int amount){
        this.acc = acc;
        this.amount = amount;
    }

    public void run(){
        acc.deposit(amount);
    }
}

class WithdrawThread extends Thread{
    Account acc;
    int amount;

    WithdrawThread(Account acc, int amount){
        this.acc = acc;
        this.amount = amount;
    }

    public void run(){
        acc.withdraw(amount);
    }
}

public class AccountSyncDemo {
    public static void main(String[] args) {

        Account acc = new Account(1000); // initial balance

        DepositThread dt1 = new DepositThread(acc, 2000);
        WithdrawThread wt1 = new WithdrawThread(acc, 1500);

        dt1.start();
        wt1.start();
    }
}

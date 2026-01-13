package Threading.MultiThreading.ThreadClass;

class Account{
    static int balance = 1000;

    static synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" Trying to withdraw..");

        if (balance >= amount){
            balance=balance-amount;
            System.out.println("Withdraw successful "+amount+"\nBalance : "+balance);
        }else {
            System.out.println("Insufficient balance");
        }
    }
}

class UserThread extends Thread{
    Account acc;

    UserThread(Account acc){
        this.acc=acc;
    }

    public void run(){
        acc.withdraw(400);
    }
}

public class SynchronizationBankApp {
    public static void main(String[] args) {
        Account a = new Account();
        Account a1 = new Account();

        UserThread t1 = new UserThread(a);
        UserThread t2 = new UserThread(a);

        t1.start();
        t2.start();
    }
}

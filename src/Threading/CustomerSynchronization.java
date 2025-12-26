package Threading;

class Account{
    int balance=0;
     synchronized void deposit(int amount){
        balance+=amount;
    }
}

public class CustomerSynchronization extends Thread{
    Account acc;

    CustomerSynchronization(Account acc){
        this.acc=acc;
    }

    @Override
    public void run(){
        for (int i=0;i<1000;i++){
            acc.deposit(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Account a = new Account();

        CustomerSynchronization t1 = new CustomerSynchronization(a);
        CustomerSynchronization t2 = new CustomerSynchronization(a);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final balance : "+a.balance);
    }
}

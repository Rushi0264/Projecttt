package Collection.Comparable;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class BankAccount{
    long accNum;
    String accHolder;
    double balance;

    BankAccount(long accNum, String accHolder, double balance){
        this.accNum=accNum;
        this.accHolder=accHolder;
        this.balance=balance;
    }

    public String toString(){
        return "Account Detail { Account Number -> "+accNum+", Holder Name -> "+accHolder+", Balance -> "+balance+" }";
    }
}

class SortByName implements Comparator<BankAccount>{
    public int compare(BankAccount b1, BankAccount b2){
        return b1.accHolder.compareTo(b2.accHolder);
    }
}

public class BankExample {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(345678,"Rushikesh",540000);
        BankAccount b2 = new BankAccount(345673,"Shubham",760000);
        BankAccount b3 = new BankAccount(875433,"Omkar",520000);
        BankAccount b4 = new BankAccount(908765,"Gaurav",260000);

        LinkedList<BankAccount> list = new LinkedList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        System.out.println("Before sort : ");
        for (BankAccount b : list){
            System.out.println(b);
        }
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------");

        Collections.sort(list, new SortByName());
        System.out.println("After sort : ");
        for (BankAccount b : list) {
            System.out.println(b);
        }
    }
}

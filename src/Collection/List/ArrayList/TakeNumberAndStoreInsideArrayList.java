package Collection.List.ArrayList;

import java.util.ArrayList;

public class TakeNumberAndStoreInsideArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        for (int i=1;i<=10;i++){
            number.add(i);
        }

        System.out.println("Numbers : "+number);
    }
}

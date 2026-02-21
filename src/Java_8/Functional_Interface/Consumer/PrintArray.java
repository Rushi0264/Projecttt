package Java_8.Functional_Interface.Consumer;

import java.util.function.Consumer;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        Consumer<Integer> array = n -> System.out.println(n);
        for (int i : arr){
            array.accept(i);
        }
    }
}

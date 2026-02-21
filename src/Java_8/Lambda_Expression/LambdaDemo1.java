package Java_8.Lambda_Expression;

interface Add{
    int addition(int a, int b);
}

public class LambdaDemo1 {
    public static void main(String[] args) {
        Add add = (a, b) -> a + b;

        int result = add.addition(2,5);

        System.out.println("Sum : "+result);
    }
}

package Java_8.Lambda_Expression;

@FunctionalInterface
interface AddInterface{
    int add(int a, int b);
}

public class Addition {
    public static void main(String[] args) {
        AddInterface obj = (a,b) -> a+b;
        int result = obj.add(12,32);
        System.out.println(result);
    }
}

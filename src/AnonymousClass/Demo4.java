package AnonymousClass;

interface Calculator{
    int add(int a, int b);
}

public class Demo4{
    static void perform(Calculator c){
        System.out.println("Result : "+c.add(10,20));
    }

    public static void main(String[] args) {
        perform(new Calculator(){
            public int add(int a, int b){
             return a+b;
            }
        });
    }
}

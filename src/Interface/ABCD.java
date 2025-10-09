package Interface;

interface Demo{
    void show(int a);
}
interface Demo1{
    void show(int a);
}

public class ABCD implements Demo,Demo1{
    @Override
    public void show(int a){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Demo1 a1 = new ABCD();
        a1.show(2);
    }
}

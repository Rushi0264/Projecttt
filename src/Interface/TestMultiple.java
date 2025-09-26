package Interface;


interface A{
    void showA();
}
interface B{
    void showB();
}

class Test implements A,B{
    @Override
    public void showA(){
        System.out.println("Show method from interface A");
    }

    @Override
    public void showB(){
        System.out.println("Show method from interface B");
    }
}

public class TestMultiple {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.showA();
        obj.showB();
    }
}

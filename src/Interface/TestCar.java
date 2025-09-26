package Interface;

interface Vehicle{
    void start();
    void stop();
}

class Car implements Vehicle{

    interface NewOne{
        void show();
    }

    @Override
    public void start(){
        System.out.println("Car starts now..!");
    }

    @Override
    public void stop(){
        System.out.println("Car stop now..!");
    }
}

public class TestCar implements Car.NewOne {

    @Override
    public void show(){
        System.out.println("Nested interface");
    }

    public static void main(String[] args) {
        Vehicle obj = new Car();
        obj.start();
        obj.stop();

        TestCar obj1 = new TestCar();
        obj1.show();
    }
}

package Interface;

interface Animal{
    void sound();
}

class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Woof..!");
    }
}

class Cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Meaiou..!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();

        obj1.sound();
        obj2.sound();
    }
}

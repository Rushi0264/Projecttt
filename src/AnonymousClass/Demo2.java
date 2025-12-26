package AnonymousClass;

interface Animal{
    void sound();
}

public class Demo2 {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void sound() {
                System.out.println("Dog bark..!");
            }
        };
        dog.sound();

        Animal cat = new Animal(){
            @Override
            public void sound(){
                System.out.println("Cat sound..!");
            }
        };
        cat.sound();
    }
}

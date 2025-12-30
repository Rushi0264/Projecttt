package AnonymousClass;

interface Greeting{
    void seyHello();
}

public class Demo1 {
    public static void main(String[] args) {
        Greeting g = new Greeting(){
            public void seyHello(){
                System.out.println("Hello From Anonymous Class");
            }
        };
        g.seyHello();
    }
}

package AnonymousClass;

abstract class Shape{
    abstract void draw();
}

public class Demo5 {
    public static void main(String[] args) {
        Shape a = new Shape(){
            public void draw(){
                System.out.println("Drawing circle");
            }
        };
        a.draw();
    }
}

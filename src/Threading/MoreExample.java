package Threading;

interface ABCD {
    void show();
}

public class MoreExample {
    public static void main(String[] args) {
        ABCD abcd = new ABCD() {
            @Override
            public void show() {
                System.out.println("This is show method");
            }
        };
        abcd.show();
    }
}
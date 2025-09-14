package JavaBasicProgramming;

public class WhyWeNeedObjects {
    int age = 100; //variable
    String name = "Java";//variable

    int addition(int a, int b){//methods
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        //syntax for creating an objects
        //classname refrence/identifier = new classname;
        WhyWeNeedObjects obj = new WhyWeNeedObjects();//creating an object of a class

        WhyWeNeedObjects object = new WhyWeNeedObjects();

    }
}

class test{
    public static void main(String[] args) {
        test object = new test();
    }
}
package Inheritance;

class parent {
    int age = 1001;
    void test(){
        System.out.println("Test method.");
    }
}

public class InheritanceUse extends parent{

    public static void main(String[] args) {
/*        parent pt = new parent();
        pt.test();*/

        InheritanceUse iused = new InheritanceUse();
        System.out.println("Access parent class variable : "+iused.age);
        iused.test();
    }
}

package JavaBasicProgramming;

public class HowToCreateMethods {

    //Syntax for creating Method


    //what can be used as a return type for a method

    //in some cases method can return something
    //=> we can use Primitive data types and non-primitive data types as a return type

    //in other cases method might not return anything

    //in java, when a method does not return anything then we use keyword 'void'

    //Syntax 1
    //no_return methodName(){
    //}

    void method1(){
        System.out.println("First line of a method ");
    }

    void show(){
        System.out.println("This is show method");
    }

    void eat(){
        System.out.println("GO to Kitchen");
        System.out.println("Take a plate");
        System.out.println("Take your food on the plate");
        System.out.println("Sit down");
        System.out.println("Take a bite and chew");
    }

    //Syntax 2
    //no_return_type methodName(parameter list){
    //}

    //no_return_type methodName(datatype name, datatype name1){
    //}

    void method(int a, long b, char c){
        System.out.println("This method is having 3 parameters");
    }

    void dummy(int aaa, double dd){
        System.out.println("This method is having 2 parameters");
    }

    void practice1(int x, int y, byte a){
        System.out.println("This method is having 3 parameters ");
    }

    void practice2(int x, long y, short a, byte b){
        System.out.println("This method is having 4 parameters ");
    }

    void practice3(int x, double y, char a){
        System.out.println("This method is having 3 parameters ");
    }

    void mix(String a, String b, byte c){
        System.out.println("This method is having 3 string parameters"+a+b+c);
    }
    //calculator  =>
}

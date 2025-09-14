package JavaBasicProgramming;

public class MoreSyntaxForMethodCreation {

    //when a method returns something, then the last line of that method
    //must be a return statement

    //in some cases method can return something
    //=> we can use Primitive data types and non-primitive data types as a return type

    //do not use keywords as variable or class or method name

    //Syntax 3
    //return_type methodName(){
    //  return statement;
    //}

    int returnAnIntValue(){
        return 100;
    }

    boolean returnBooleanValue(){
        System.out.println("This is test message");
        System.out.println("This is test message");

        return false;
        // System.out.println("This is test message");
    }

    //Syntax 4
    //return_type methodName(parameter-list){
    //  return statement;
    //}

    int addition(int a, int b){
        int c =  a + b;
        return c;
    }

    long additionOfMoreParameters(long a, long b){
        long c =  a + b;
        return c;
    }

    int class1233(){
        return 100;
    }

    long add(int x, long y){
        long c = x + y;
        return c;
    }

    int multiply(int a, int b){
        int c = a * b;
        return c;
    }

    int division(int x, int y){
        int c = x / y;
        return c;
    }

    int subtraction(int a, int b){
        int c = a - b;
        return c;
    }

    int modulo(int a, int b){
        int c = a % b;
        return c;
    }

}

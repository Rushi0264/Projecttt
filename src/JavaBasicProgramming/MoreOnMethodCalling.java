package JavaBasicProgramming;

public class MoreOnMethodCalling {

        int addition(int a, int b, int c){
            return a + b + c;
        }

        void returnNothing(int a, boolean b){
            System.out.println("This method returns nothing ");
        }

        void testMethod(char c, long l, boolean b){
            System.out.println("This method returns nothing and takes 3 arguments ");
        }

        void dummyMethod(int a, String name){
            System.out.println("Dummy method takes String argument "+name);
        }

        public static void main(String[] args) {

            MoreOnMethodCalling obj = new MoreOnMethodCalling();
            obj.addition(100, 200, 300);
            obj.returnNothing(1000, true);
            obj.testMethod('a',999999, false);
            obj.dummyMethod(200, "Java");

        /*int a = 10 + 20;   //addition

        String s = "Java "+ 30;   //concatenation

        System.out.println("Value of a is "+a);

        System.out.println("Value of s is "+s);*/
        }
}

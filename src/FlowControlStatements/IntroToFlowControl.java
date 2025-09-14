package FlowControlStatements;

public class IntroToFlowControl {
    public static void main(String[] args) {
        /*int a=100;
        int b=200;

        if(b>a){
            System.out.println("Value of b is greater than a ");
        }*/

        //nested if

        int i=11;
        if(i==10 || i<15){

            if(i<15){
                System.out.println("I is smaller than 15");

                if (i<11){
                    System.out.println("I is smaller than 13");
                }
            }

            if (i<12){
                System.out.println("I is smaller than 12 too ");
            }
        }
        else {
            System.out.println("I is greater than 15");
        }
    }
}

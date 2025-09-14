package FlowControlStatements;

public class IfElseStatement {
    //voting
    //if age >18 =>you can cast your vote
    //else => you can not cast your vote

    public static void main(String[] args) {
        int age=17;

        if (age >= 18){
            System.out.println("You can vote.");
        }else {
            System.out.println("No you can not vote.");
        }
    }
}

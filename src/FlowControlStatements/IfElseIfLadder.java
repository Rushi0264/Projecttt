package FlowControlStatements;

public class IfElseIfLadder {

    public static void main(String[] args) {
        //marks 90>= => passed in merit
        //marks 75>= and 90< =>passed in distinction
        //marks 60>= and 75< =>passed in first class
        //marks 35>= and 60< =>passed in second class
        //marks <35 => you failed in exam

        int marks=77;
        if (marks>=90){
            System.out.println("Passed in merit");
        } else if (marks>=75 && marks<90) {
            System.out.println("Passed in distinction");
        } else if (marks>=60 && marks<75) {
            System.out.println("Passed in first class");
        } else if (marks>=35 && marks<60) {
            System.out.println("Passed in second class");
        } else if (marks<35) {
            System.out.println("You failed in exam");
        }
    }
}
package OperatorProgram;

public class LogicalOperator {

    public static void main(String[] args) {
        int a=100;
        int b=400;
        int c=300;

        //&&, Logical and : returns true value when both conditions are true
        //if any one condition is false then return will be false

        boolean logicalAnd = (a<b) && (b<c);
        System.out.println("Check Logical And = "+logicalAnd);//false

        boolean LogicalAnd = (a>b) && (b<c);
        System.out.println("Check logical And : "+LogicalAnd);//false

        boolean logicaland = (a<b) && (b>c);
        System.out.println("check logical and : "+logicaland);//true

        boolean LogAnd = (a>b) && (b>c);
        System.out.println("Check logical and : "+LogAnd);//false


        // || Logical OR : returns true value if any one condition will true
        //when all two condition are false then return will be false

        boolean logicalOr = (a<b) || (b<c);
        System.out.println("\nCheck logical or : "+logicalOr);//true

        boolean LogicalOr = (a<b) || (b>c);
        System.out.println("Check logical or : "+LogicalOr);//true

        boolean Logicalor = (a>b) || (b<c);
        System.out.println("Check logical or : "+Logicalor);//false

        boolean logicalor = (a>b) || (b>c);
        System.out.println("Check logical or : "+logicalor);//true

        //!, Logical not = returns true value when a condition is false and vise-versa

        boolean logicalNot = !((a<b) || (b<c));
        System.out.println("\nOne Condition is true then result is false : "+logicalNot);//false = because one condition is true

        boolean logicalnot = !((a>b) || (b>c));
        System.out.println("One Condition is true then result is false : "+logicalnot);//false = because one condition is true

        boolean LogicalNot = !((a<b) || (b>c));
        System.out.println("Both Condition is true then result is false : "+LogicalNot);//false = because both condition is true

        boolean LogicalNot1 = !((a>b) || (b<c));
        System.out.println("Both Condition is false then result is true : "+LogicalNot1);//true = because one condition is true

        boolean LogicalNot2 = !((a<b) && (b<c));
        System.out.println("\nOne condition is false then result is true : "+LogicalNot2);//true = because one condition is false

        boolean LogicalNot3 = !((a>b) && (b>c));
        System.out.println("One condition is false then result is true : "+LogicalNot3);//true = because one condition is false

        boolean LogicalNot4 = !((a>b)&&(b<c));
        System.out.println("Both condition is false then result is true : "+LogicalNot4);//true = because one condition is false

        boolean LogicalNot5 = !((a<b) && (b>c));
        System.out.println("Both Condition is true then result is false : "+LogicalNot5);//false = because both condition is true


    }
}
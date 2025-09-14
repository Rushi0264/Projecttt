package OperatorProgram;

public class RelationalOperator {

    void check(){
        int a = 99;
        int b = 10;

        boolean checkEquality = (a == b);
        System.out.println("Check equality : " + checkEquality);//false

        boolean checkNotEquality = (a != b);
        System.out.println("Check not equality : " + checkNotEquality);//true

        boolean checkGreater = (a > b);
        System.out.println("Check greater than : " + checkGreater);//true

        boolean checkGreaterEqual = (a >= b);
        System.out.println("Check greater than or equal : " + checkGreaterEqual);//true

        boolean checkLess = (a < b);
        System.out.println("Check less than : " + checkLess);//false

        boolean checkLessEqual = (a <= b);
        System.out.println("Check less or equal : " + checkLessEqual);//false
    }

    void check1(){
        int a=23;
        int b=44;

        boolean checkEquality = (a == b);
        System.out.println("\n\nCheck equality : " + checkEquality);//false

        boolean checkNotEquality = (a != b);
        System.out.println("Check not equality : " + checkNotEquality);//true

        boolean checkGreater = (a > b);
        System.out.println("Check greater than : " + checkGreater);//false

        boolean checkGreaterEqual = (a >= b);
        System.out.println("Check greater than or equal : " + checkGreaterEqual);//false

        boolean checkLess = (a < b);
        System.out.println("Check less than : " + checkLess);//true

        boolean checkLessEqual = (a <= b);
        System.out.println("Check less or equal : " + checkLessEqual);//true
    }

    void check2(){
        int a=54;
        int b=23;

        boolean checkEquality = (a == b);
        System.out.println("\n\nCheck equality : " + checkEquality);//false

        boolean checkNotEquality = (a != b);
        System.out.println("Check not equality : " + checkNotEquality);//true

        boolean checkGreater = (a > b);
        System.out.println("Check greater than : " + checkGreater);//true

        boolean checkGreaterEqual = (a >= b);
        System.out.println("Check greater than or equal : " + checkGreaterEqual);//true

        boolean checkLess = (a < b);
        System.out.println("Check less than : " + checkLess);//false

        boolean checkLessEqual = (a <= b);
        System.out.println("Check less or equal : " + checkLessEqual);//false
    }

    void check3(){
        int a=24;
        int b=24;

        boolean checkEquality = (a == b);
        System.out.println("\n\nCheck equality : " + checkEquality);//true

        boolean checkNotEquality = (a != b);
        System.out.println("Check not equality : " + checkNotEquality);//false

        boolean checkGreater = (a > b);
        System.out.println("Check greater than : " + checkGreater);//false

        boolean checkGreaterEqual = (a >= b);
        System.out.println("Check greater than or equal : " + checkGreaterEqual);//true

        boolean checkLess = (a < b);
        System.out.println("Check less than : " + checkLess);//false

        boolean checkLessEqual = (a <= b);
        System.out.println("Check less or equal : " + checkLessEqual);//true
    }

    public static void main(String[] args) {
        RelationalOperator obj = new RelationalOperator();
        obj.check();
        obj.check1();
        obj.check2();
        obj.check3();
    }
}


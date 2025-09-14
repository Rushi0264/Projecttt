package JavaBasicProgramming;

public class variableWideningNarrowing {
    //widening => convert data from smaller data type to larger
     int myInt = 9;
     double myDouble = myInt;

     byte bb = 100;
     short ss = bb;

     //narrowing => convert data from large data type to smaller
    double dd = 9000;
    int iii = (int) dd;
    byte bbb = (byte) dd;

}

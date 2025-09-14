package IntroToArray;

public class WhyWeNeedArray {

        int a = 100;

        //students age store in  variable
        //when we want to store multiple values of same type in single variable
        //we use Array

        //Syntax for array
        //Syntax 1

        /*dataType[] referenceName = new dataType[size];
        int[] intArray = new  int[10];   //15  0-9
        intArray[5] = 100;*/

        public static void main(String[] args) {
            //dataType[] referenceName = new dataType[size];
            int[] intArray = new int[10];   //15  0-9
            intArray[0] = 10;
            intArray[1] = 20;
            intArray[2] = 30;
            intArray[3] = 40;
            intArray[4] = 50;
            intArray[5] = 60;
            intArray[6] = 70;
            intArray[7] = 80;
            intArray[8] = 90;
            intArray[9] = 100;

            System.out.println("Print element from Array "+intArray[6]);   //70


            int[] arrrrrTemp = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};   //size = 10  firstindex = 0  lastindex = 9
            //10, 20, 30, 40, 50, 60, 70, 80, 90, 100
            //0   1   2   3   4   5   6   7   8   9

            System.out.println("Print element from Array "+arrrrrTemp[5]);  //60

        }
    }
    //Syntax 1

    /*//dataType[] referenceName = new dataType[size];
    int[] intArray = new  int[10];   //15  0-9

    //Syntax 2
    //dataType[] referenceName = {values};*/

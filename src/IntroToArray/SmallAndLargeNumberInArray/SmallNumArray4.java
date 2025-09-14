package IntroToArray.SmallAndLargeNumberInArray;

public class SmallNumArray4 {
    public static void main(String[] args) {
        int Smallarr[] = {44,66,88,23,90,11,9};
        int num = Smallarr[0];

        for (int i=0; i<Smallarr.length; i++) {
            System.out.println(Smallarr[i]);
        }

        for (int i=0; i<Smallarr.length; i++){
            if (Smallarr[i] < num){
                num = Smallarr[i];
            }
        }
        System.out.println("Smaller element in this array : "+num);
    }
}

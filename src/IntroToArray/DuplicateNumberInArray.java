package IntroToArray;

public class DuplicateNumberInArray {
    public static void main(String[] args) {
        int original[] = {7,4,2,2,3,3,5};

        for (int i=0; i< original.length; i++){
            for (int j=i+1; j< original.length; j++){
                if (original[i] == original[j]){
                    System.out.println(original[i]);
                }
            }
        }
    }
}

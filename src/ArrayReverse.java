import java.util.Arrays;
public class ArrayReverse {
    public static void main(String[] args) {
        int[] data1 = {1,2,3,4,5,6};

        int[] reverseData1 = reverseArray(data1);

        for (int i = 0; i < reverseData1.length; i++) {
            System.out.print(reverseData1[i]);
        }
    }

    public static int[] reverseArray( int[] input) {

        int[] reverse = new int[input.length];
        int j = 0;
        for(int i = input.length-1; i >= 0; i--){
            reverse[j] = input[i];
            j++;
        }

        return reverse;
   }
}

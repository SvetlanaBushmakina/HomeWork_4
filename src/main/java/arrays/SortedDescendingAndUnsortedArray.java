package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortedDescendingAndUnsortedArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 43, 5, 6, 77, 8, 9, 100};
        System.out.println(Arrays.toString(myArray));
        Integer[] myArray2 = new Integer[myArray.length];
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = myArray[i];
        }
        Integer[] myArray3 = myArray2.clone();
        Arrays.sort(myArray2, Collections.reverseOrder());
        if (Arrays.equals(myArray3, myArray2)) {
            System.out.println("Массив отсортирован по убыванию");
        } else {
            System.out.println("Массив не отсортирован по убыванию");
        }
    }
}

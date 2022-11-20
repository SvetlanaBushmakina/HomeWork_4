package arrays;

import java.util.Arrays;

public class AscendingSortedAndUnsortedArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 43, 5, 6, 7, 8, 9, 100};
        System.out.println(Arrays.toString(myArray));
        int[] myArray2 = myArray.clone();
        Arrays.sort(myArray2);
        if (Arrays.equals(myArray, myArray2)) {
            System.out.println("Массив отсортирован по возрастанию");
        } else {
            System.out.println("Массив не отсортирован по возрастанию");
        }
    }
}

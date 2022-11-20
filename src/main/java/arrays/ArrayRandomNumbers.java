package arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayRandomNumbers {
    public static void main(String[] args) {

        int arrayLength = 10;
        int[] myArray = new int[arrayLength];
        for (int i = 0; i < myArray.length; i++) {
            int number = ThreadLocalRandom.current().nextInt(101);
            myArray[i] = number;
        }
        System.out.println(Arrays.toString(myArray));
    }
}

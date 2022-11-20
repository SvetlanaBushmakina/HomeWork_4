package arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SumElementsInArray {
    public static void main(String[] args) {
        int arrayLength = 10;
        int sum = 0;
        int[] myArray = new int[arrayLength];
        for (int i = 0; i < myArray.length; i++) {
            int number = ThreadLocalRandom.current().nextInt(101);
            myArray[i] = number;
            sum += number;
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("Сумма всех элементов массива = " + sum);
    }
}


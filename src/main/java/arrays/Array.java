package arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        myArray[5] = 6;
        myArray[6] = 7;
        myArray[7] = 8;
        myArray[8] = 9;
        myArray[9] = 10;
        System.out.println("Первый массив " + Arrays.toString(myArray));

        int[] myArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Второй массив " + Arrays.toString(myArray2));
    }

    public static class ArrayAutomaticInReverse {
        public static void main(String[] args) {

            int[] myArray = new int[100];
            for (int i = 0, j = 99; i < myArray.length; i++, j--) {
                myArray[i] = j;
                System.out.println(i + " - " + myArray[i]);
            }
        }
    }
}

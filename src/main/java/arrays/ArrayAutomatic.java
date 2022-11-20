package arrays;

import java.util.Arrays;

public class ArrayAutomatic {
    public static void main(String[] args) {

        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            System.out.println(i + " - " + myArray[i]);
        }
    }
}

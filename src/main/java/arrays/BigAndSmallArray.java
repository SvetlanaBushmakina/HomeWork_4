package arrays;

public class BigAndSmallArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100};
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println(sum);
        if (sum > 100) {
            System.out.println("Это большой массив");
        } else {
            System.out.println("Это маленький массив");
        }
    }
}

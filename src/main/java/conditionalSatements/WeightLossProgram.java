package conditionalSatements;

public class WeightLossProgram {
    public static void main(String[] args) {
        int dailyCalorieLimit = 1400;
        int currentCalories = 1150;
        System.out.println("Программист потребил уже " + currentCalories);
        int chocolate = 340;
        int porridge = 250;
        int lard = 500;

        if ((currentCalories + lard) <= dailyCalorieLimit) {
            System.out.println("Можно съесть cало");
        } else if ((currentCalories + chocolate) <= dailyCalorieLimit) {
            System.out.println("Можно съесть шоколодку");
        } else if ((currentCalories + porridge) <= dailyCalorieLimit) {
            System.out.println("Можно съесть кашу");
        } else {
            System.out.println("Лимит каллорий на сегодня исчерпан");
        }
    }
}

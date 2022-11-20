package conditionalSatements;

public class TimeOfDayWithErrors {
    public static void main(String[] args) {
        int currentHour = 24;
        if (currentHour >= 0 && currentHour < 6) {
            System.out.println("Ночь");
        } else if (currentHour >= 6 && currentHour < 12) {
            System.out.println("Утро");
        } else if (currentHour >= 12 && currentHour < 18) {
            System.out.println("День");
        } else if (currentHour >= 18 && currentHour < 24) {
            System.out.println("Вечер");
        } else if (currentHour < 0) {
            System.out.println("Введите верное время");
        } else if (currentHour > 23) {
            System.out.println("Вернитесь на Землю");
        }
    }
}

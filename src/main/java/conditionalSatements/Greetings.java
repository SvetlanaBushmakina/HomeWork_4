package conditionalSatements;

public class Greetings {
    public static void main(String[] args) {
        int currentHour = 19;
        int dayOfTheWeek = 6;
        if ((dayOfTheWeek >= 1 && dayOfTheWeek <= 5) && (currentHour >= 0 && currentHour < 8)) {
            System.out.println("Доброе утро");
        } else if ((dayOfTheWeek >= 1 && dayOfTheWeek <= 5) && (currentHour >= 8 && currentHour < 11)) {
            System.out.println("Всё пропало ты проспал!");
        } else if ((dayOfTheWeek >= 1 && dayOfTheWeek <= 5) && (currentHour >= 11)) {
            System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул");
        } else if ((dayOfTheWeek >= 6 && dayOfTheWeek <= 7) && (currentHour >= 0 && currentHour < 12)) {
            System.out.println("Доброе утро");
        } else if ((dayOfTheWeek >= 6 && dayOfTheWeek <= 7) && (currentHour >= 12 && currentHour < 16)) {
            System.out.println("Лучше поспать ещё");
        } else if ((dayOfTheWeek >= 6 && dayOfTheWeek <= 7) && (currentHour >= 16 && currentHour < 18)) {
            System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
        } else if ((dayOfTheWeek >= 6 && dayOfTheWeek <= 7) && (currentHour >= 18)) {
            System.out.println("Дааа, с режимом надо что-то делать");
        }
    }
}

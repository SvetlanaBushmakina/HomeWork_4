package conditionalSatements;

public class FightBetweenJediAndSith {
    public static void main(String[] args) {
        int positionJedi = 2;
        int positionSith = 3;
        String sith = "Палпатин";
        String jedi = "Оби Ван";
        if (sith == "Палпатин") {
            System.out.println("Палпатин выйграл");
        } else if (jedi == "Оби Ван" && sith == "Дарт Мол" && positionSith == positionJedi) {
            System.out.println("Оби Ван выйграл");
        } else if (positionSith > positionJedi) {
            System.out.println("Ситх проиграл");
        } else if (positionJedi > positionSith) {
            System.out.println("Джедай выйграл");
        } else if (positionSith == positionJedi) {
            System.out.println("Ситх выйграл");
        }
    }
}

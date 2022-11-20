package conditionalSatements;

public class IdealWeight {
    public static void main(String[] args) {
        double growth = 160;
        double weight = 60;
        double idealWeight = (growth - 100) - ((growth - 100) * 0.1) + 5;
        System.out.println(idealWeight);
        if (weight == idealWeight){
            System.out.println("Идеальный вес");
        } else {
            System.out.println("Неидеальный вес");
        }
    }
}

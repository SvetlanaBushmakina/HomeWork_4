package conditionalSatements;

public class AttractionControl {
    public static void main(String[] args) {
        boolean withParents = true;
        int growth = 130;
        if (withParents == true || growth >= 160) {
            System.out.println("Можно на аттракцион");
        } else {
            System.out.println("Нельзя на аттракцион");
        }
    }
}

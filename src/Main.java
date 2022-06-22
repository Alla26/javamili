public class Main {
    public static void main(String[] args) {
        double price = 1350.75;
        int quantityPerMile = 20;

        int mile = (int) (price / quantityPerMile);
        System.out.println(("Количество миль: ") + mile);

        //System.out.println(("Количество миль: ") + ((int) (price / quantityPerMile)));

        /*int priceSecond = 135;
        int quantityPerMileSecond = 20;
        if (priceSecond >= quantityPerMileSecond) {
            System.out.println(("Количество миль: ") + (priceSecond / quantityPerMileSecond));
        } else {
            System.out.println("Потраченных денежных средств недостаточно для начисления миль");}*/
    }
}
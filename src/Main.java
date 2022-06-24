public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(("Количество миль:  ") + (miles));
    }
}

/*public class Main {
    public static void main(String[] args) {
        double price = 10_000;
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
// }
//}
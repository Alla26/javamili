public class Main {
    public static void main(String[] args) {
        double price = 1350.75;
        int x = 20;

        int m = (int) (price / x);
        System.out.println(("Количество миль: ") + m);

        //System.out.println(("Количество миль: ") + ((int) (price / x)));//

        /*int priceSecond = 135;
        int y = 20;
          if (priceSecond>=y) {
            System.out.println(("Количество миль: ") + (priceSecond / y));
        }
        else { System.out.println("Потраченных денежных средств недостаточно для начисления миль"); }*/
    }
}
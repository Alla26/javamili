public class BonusMilesService {
    public int calculate(int cost) {
        int quantityPerMile = 20;
        int result;
        if (cost > quantityPerMile) {
            result = cost / quantityPerMile;
        } else {
            result = 0;
        }
        return result;
    }
}
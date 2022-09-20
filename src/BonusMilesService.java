public class BonusMilesService {
    public int calculate(int price) {
        int mileCost = 20;
        int bonusMiles = price / mileCost;
        return bonusMiles;
    }
}


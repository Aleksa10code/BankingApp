public class BronzeCard extends BaseCard{

    public BronzeCard(String ownerName) {
        super(ownerName);
    }

    @Override
    protected double getDiscountRate(double amount) {
        turnover += amount;
        if (turnover < 100) {
            return 0;
        }

        else if (turnover < 300) {
            return 1;
        }

        else {
            return 2.5;
        }
    }
}

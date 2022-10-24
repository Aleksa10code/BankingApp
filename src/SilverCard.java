public class SilverCard extends BaseCard{

    public SilverCard(String ownerName) {
        super(ownerName);
    }

    @Override
    protected double getDiscountRate(double amount) {
        turnover += amount;
        if (turnover > 300) {
            return 3.5;
        }

        else {
            return 2;
        }
    }
}

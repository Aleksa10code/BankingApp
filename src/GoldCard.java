public class GoldCard extends BaseCard{

    public GoldCard(String ownerName) {
        super(ownerName);
    }

    @Override
    protected double getDiscountRate(double amount) {

        turnover += amount;
        double discountRate = 2;
        discountRate += (turnover / 100);
        if (discountRate > 10.0) {
            discountRate = 10.0;
        }
        return discountRate;
    }
}

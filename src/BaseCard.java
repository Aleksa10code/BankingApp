public abstract class BaseCard {

    String ownerName;
    double turnover;

    public BaseCard(String ownerName) {

    }

    protected abstract double getDiscountRate(double amount);

}

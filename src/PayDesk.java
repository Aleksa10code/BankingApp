public class PayDesk {
    public static void main(String[] args) {

        BronzeCard bronzeCard = new BronzeCard("Aleksa");
        SilverCard silverCard = new SilverCard("Marko");
        GoldCard goldCard = new GoldCard("Milan");

        purchase(1000, bronzeCard);
        purchase(200, silverCard);
        purchase(500, goldCard);

    }
    private static void purchase(double value, BaseCard card) {
        double purchase = value;
        double discountRate = card.getDiscountRate(value);
        double discount = value * discountRate / 100;
        double total = value - discount;
        print("Purchase value: " + "$" + purchase);
        print("Discount rate: " + discountRate + "%");
        print("Discount: " + "$" + discount);
        print("Total: " + "$" + total);
        print("\n");
    }

    private static void print(String text) {
        System.out.println(text);
    }
}

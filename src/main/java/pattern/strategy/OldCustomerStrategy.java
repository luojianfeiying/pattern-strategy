package pattern.strategy;

public class OldCustomerStrategy implements Strategy {
    public double calcPrice(double goodsPrice) {
        System.out.println("老用户打95折");
        return goodsPrice * (1-0.05);
    }
}

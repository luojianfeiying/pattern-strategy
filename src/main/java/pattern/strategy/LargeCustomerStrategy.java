package pattern.strategy;

public class LargeCustomerStrategy implements Strategy {
    public double calcPrice(double goodsPrice) {
        System.out.println("大客户打9折");
        return goodsPrice * (1-0.1);
    }
}

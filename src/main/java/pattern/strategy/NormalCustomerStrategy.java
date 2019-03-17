package pattern.strategy;

public class NormalCustomerStrategy implements Strategy{
    public double calcPrice(double goodsPrice) {
        System.out.println("普通用户没有折扣");
        return goodsPrice;
    }
}

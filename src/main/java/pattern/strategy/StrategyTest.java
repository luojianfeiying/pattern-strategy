package pattern.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Strategy strategy = new LargeCustomerStrategy();
        Price price = new Price(strategy);
        double qoute = price.qoute(1000);
        System.out.println("向客户报价：" + qoute);
    }
}

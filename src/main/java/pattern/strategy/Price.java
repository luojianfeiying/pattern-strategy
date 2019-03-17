package pattern.strategy;

public class Price {

    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    public double qoute(double goodsPrice){
        return this.strategy.calcPrice(goodsPrice);
    }
}

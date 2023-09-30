package creational.factorymethod;

public class CommercialPlan extends Plan {
    @Override
    protected double getRate() {
        return 7.50;
    }
}

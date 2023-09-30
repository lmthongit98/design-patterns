package creational.factorymethod;

public class DomesticPlanCalculator extends BillAmountCalculator{
    @Override
    public Plan createPlan() {
        return new DomesticPlan();
    }

    @Override
    public String getPlanType() {
        return "Domestic";
    }
}

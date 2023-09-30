package creational.factorymethod;

public class InstitutionPlanCalculator extends BillAmountCalculator{
    @Override
    public Plan createPlan() {
        return new InstitutionalPlan();
    }

    @Override
    public String getPlanType() {
        return "Institution";
    }
}

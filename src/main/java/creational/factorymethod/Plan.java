package creational.factorymethod;

public abstract class Plan {
    protected abstract double getRate();

    public double calculateBillAmount(int units) {
        return units * getRate();
    }
}

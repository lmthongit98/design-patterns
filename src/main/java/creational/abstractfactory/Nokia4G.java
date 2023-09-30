package creational.abstractfactory;

public class Nokia4G implements Nokia{
    @Override
    public String getModelName() {
        return this.getClass().getName();
    }
}

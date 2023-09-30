package creational.abstractfactory;

public class Iphone3G implements Apple{
    @Override
    public String getModelName() {
        return this.getClass().getName();
    }
}

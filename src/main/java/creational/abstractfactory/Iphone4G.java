package creational.abstractfactory;

public class Iphone4G implements Apple{
    @Override
    public String getModelName() {
        return this.getClass().getName();
    }
}

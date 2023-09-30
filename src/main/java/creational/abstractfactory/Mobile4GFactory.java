package creational.abstractfactory;

public class Mobile4GFactory implements MobileFactory{
    @Override
    public Nokia createNokiaMobile() {
        return new Nokia4G();
    }

    @Override
    public Apple createAppleMobile() {
        return new Iphone4G();
    }
}

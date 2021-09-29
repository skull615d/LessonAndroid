package tires;

public class ForBus implements Tire{
    @Override
    public String manufacturer() {
        return "unknown";
    }

    @Override
    public String width() {
        return "big";
    }
}

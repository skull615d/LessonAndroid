package tires;

public class ForTruck implements Tire{

    @Override
    public String manufacturer() {
        return "unknown";
    }

    @Override
    public String width() {
        return "big";
    }
}

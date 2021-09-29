package tires;

public class Continental implements Tire{
    @Override
    public String manufacturer() {
        return "Continental";
    }

    @Override
    public String width() {
        return "30";
    }
}

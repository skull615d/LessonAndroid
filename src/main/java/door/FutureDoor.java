package door;

public class FutureDoor implements Door{
    @Override
    public String open() {
        return "Open Up";
    }

    @Override
    public String close() {
        return "Close down";
    }
}

package door;

public class NormalDoor implements Door{
    @Override
    public String open() {
        return "opens to the side";
    }

    @Override
    public String close() {
        return "closes silently";
    }
}

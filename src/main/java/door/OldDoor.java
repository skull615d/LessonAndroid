package door;

public class OldDoor implements Door{

    @Override
    public String open() {
        return "IIIIIII";
    }

    @Override
    public String close() {
        return "IIIIIIBDCH";
    }
}

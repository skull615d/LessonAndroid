package engines;

public class FSDEngine implements Engine{

    public String prepareFSD(){
        return "Prepared";
    }

    @Override
    public String makeRotation() {
        return "60ly/s";
    }
}

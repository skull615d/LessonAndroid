import beepers.Beeper;
import door.Door;
import engines.Engine;
import tires.Tire;

public class Nefaz extends Bus{
    public Nefaz(Beeper beeper, Engine engine, Tire tire, Door door, int quantityPassenger) {
        super(beeper, engine, tire, door, quantityPassenger);
    }
}

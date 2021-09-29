package cars;

import beepers.Beeper;
import door.Door;
import engines.Engine;
import tires.Tire;

public class Lambo extends Car {

    public Lambo(Beeper beeper, Engine engine, Tire tire, Door door) {
        super(beeper, engine, tire, door);
    }
}

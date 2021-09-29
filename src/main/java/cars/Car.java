package cars;

import beepers.Beeper;
import door.Door;
import engines.Engine;
import tires.Tire;

public abstract class Car extends Transport {

    public Car(Beeper beeper, Engine engine, Tire tire, Door door) {
        super(beeper, engine, tire, door);
    }
}

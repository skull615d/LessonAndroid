import beepers.Beeper;
import cars.Transport;
import door.Door;
import engines.Engine;
import tires.Tire;

public abstract class Bus extends Transport {
    private int quantityPassenger;

    public Bus(Beeper beeper, Engine engine, Tire tire, Door door, int quantityPassenger) {
        super(beeper, engine, tire, door);

        this.quantityPassenger = quantityPassenger;
    }


    public int getCountPassenger(){
        return quantityPassenger;
    }
}

import beepers.Beeper;
import cars.Transport;
import door.Door;
import engines.Engine;
import tires.Tire;

public abstract class Truck extends Transport {

    double tonnage;
    Basket basket;

    public Truck(Beeper beeper, Engine engine, Tire tire, Door door, double tonnage, Basket basket) {
        super(beeper, engine, tire, door);
        this.tonnage = tonnage;
    }

    public String getTonnage(){
        return String.valueOf(tonnage);
    }


}

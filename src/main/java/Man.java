import beepers.Beeper;
import door.Door;
import engines.Engine;
import tires.Tire;

public class Man extends Truck{
    public Man(Beeper beeper, Engine engine, Tire tire, Door door, double tonnage, Basket basket) {
        super(beeper, engine, tire, door, tonnage, basket);
    }
}

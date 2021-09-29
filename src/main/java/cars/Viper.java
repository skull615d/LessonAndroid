package cars;

import beepers.Beeper;
import door.Door;
import engines.Engine;
import tires.Tire;

public class Viper extends Car {


    public Viper(Beeper beeper, Engine engine, Tire tire, Door door) {
        super(beeper, engine, tire, door);
    }

    public void scoopFuel(){
        System.out.println("Fuel scooped");
    }

    public void landRoPlanet(){
        System.out.println("Vehicle landed");
    }
}

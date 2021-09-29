package cars;

import beepers.Beeper;
import door.Door;
import engines.Engine;
import tires.Tire;

public abstract class Transport {

    private Beeper beeper;

    private Engine engine;

    private Tire tire;

    private Door door;

    public Transport(Beeper beeper, Engine engine, Tire tire,Door door){

        this.beeper = beeper;
        this.engine = engine;
        this.tire = tire;
        this.door = door;
    }

    public String chekBeep(){
        return beeper.makeSound();
    }

    public String checkSpeed(){
        return engine.makeRotation();
    }
    public String widthTire(){
        return tire.width();
    }
    public String checkOpenDoor(){
        return door.open();
    }
}

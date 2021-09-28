import beepers.Beeper;
import engine.Engine;

public abstract class Car {
    private Beeper beeper;

    private Engine engine;

    public Car (Beeper beeper,Engine engine){
        this.beeper = beeper;
        this.engine = engine;
    }

    public String chekBeep(){
        return beeper.makeSound();
    }

    public String checkSpeed(){
        return engine.makeRotation();
    }
}

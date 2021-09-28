import beepers.Beeper;
import engine.Engine;

public class Viper extends Car{

    public Viper(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }

    public void scoopFuel(){
        System.out.println("Fuel scooped");
    }

    public void landRoPlanet(){
        System.out.println("Vehicle landed");
    }
}

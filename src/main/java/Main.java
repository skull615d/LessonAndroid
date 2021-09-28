import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import engine.Engine12V;
import engine.FSDEngine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        Horn horn = new Horn();
        FancyMusic fancyMusic = new FancyMusic();
        MagicSparks magicSparks = new MagicSparks();
        Engine12V engine12V = new Engine12V();
        Lambo lambo = new Lambo(horn, engine12V);
        Viper viper = new Viper(fancyMusic,new FSDEngine());
//        System.out.println(lambo.chekBeep());
//        System.out.println(lambo.checkSpeed());

        ArrayList<Car> listCar = new ArrayList<>();
        listCar.add(lambo);
        listCar.add(viper);
        for (Car car : listCar){
            System.out.println(car.chekBeep());
            System.out.println(car.checkSpeed());
        }

    }
}

import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import cars.*;
import door.FutureDoor;
import door.NormalDoor;
import door.OldDoor;
import engines.Engine12V;
import engines.FSDEngine;
import engines.oldEngine;
import tires.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        Horn horn = new Horn();
        FancyMusic fancyMusic = new FancyMusic();
        MagicSparks magicSparks = new MagicSparks();
        Engine12V engine12V = new Engine12V();
        NormalDoor normalDoor = new NormalDoor();
        OldDoor oldDoor = new OldDoor();
        FutureDoor futureDoor = new FutureDoor();
        Continental continental = new Continental();
        Nokian nokian = new Nokian();

        Lambo lambo = new Lambo(horn, engine12V, continental,normalDoor);

        Viper viper = new Viper(fancyMusic,new FSDEngine(), nokian, normalDoor);


        Vaz vaz = new Vaz(horn, new oldEngine(),new Kama(),oldDoor);

        Nefaz nefaz = new Nefaz(horn,new oldEngine(),new ForBus(),normalDoor,20);

        Man man = new Man(magicSparks,engine12V,new ForTruck(),normalDoor,20.0,new BasketForOldTruck());
//        System.out.println(lambo.chekBeep());
//        System.out.println(lambo.checkSpeed());

        ArrayList<Transport> listTransport = new ArrayList<>();
        listTransport.add(lambo);
        listTransport.add(viper);
        listTransport.add(vaz);
        listTransport.add(nefaz);
        listTransport.add(man);
        for (Transport transport : listTransport){
            System.out.println(transport.chekBeep());
            System.out.println(transport.checkSpeed());
        }
    }
}

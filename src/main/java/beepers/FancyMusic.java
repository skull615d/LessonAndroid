package beepers;

import beepers.Beeper;

public class FancyMusic implements Beeper {
    @Override
    public String makeSound() {
        return "LLALALALALLALALA";
    }

    public String checkArtist(){
        return "unknown Artist";
    }
}

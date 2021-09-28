package beepers;

import beepers.Beeper;

public class Horn implements Beeper {
    @Override
    public String makeSound() {
        return "HOOOOOOO";
    }
}

package lotr;

import java.util.Random;

public class Knight extends Noble {
    public Knight() {
        super(2, 12);
    }

    @Override
    public String toString() {
        return "Knight{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}

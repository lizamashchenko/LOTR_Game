package lotr;

import kicking.kickStrategy;
import kicking.nobleKick;
import java.util.Random;

public class Noble extends Character implements kickStrategy {
    private int min, max;

    public Noble(int min, int max) {
        super(new Random().nextInt(max - min) + min, new Random().nextInt(max - min) + min);
    }

    @Override
    public void kick(Character kicker, Character opponent) {
        new nobleKick().kick(kicker, opponent);
    }
}

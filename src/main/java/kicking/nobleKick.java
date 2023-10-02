package kicking;

import lotr.Character;
import java.util.Random;

public class nobleKick implements kickStrategy{

    @Override
    public void kick(Character kicker, Character opponent) {
        opponent.setHp(opponent.getHp() - (new Random().nextInt(kicker.getPower() + 1) - 1));
    }
}

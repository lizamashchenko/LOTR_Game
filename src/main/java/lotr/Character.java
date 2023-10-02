package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor
public abstract class Character {
    protected int power, hp;

    public void setHp(int hp) {this.hp = Math.max(hp, 0);}

    public void kick(Character c) {

    }
    public boolean isAlive() { return hp > 0; }

    @Override
    public String toString() {
        return "Character{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}

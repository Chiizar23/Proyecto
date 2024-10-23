package rpg.entities;

public class Player extends GameCharacter {

    public Player(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " ataca con una espada.");
    }
}

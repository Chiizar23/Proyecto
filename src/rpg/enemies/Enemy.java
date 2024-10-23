package rpg.entities.enemies;

public abstract class Enemy {
    protected String name;
    protected int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void receiveDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " ha sido derrotado.");
        } else {
            System.out.println(name + " tiene " + health + " puntos de vida restantes.");
        }
    }

    public abstract void attack();
}

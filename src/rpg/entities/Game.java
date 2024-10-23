package rpg.entities;

import rpg.entities.enemies.enemyTypeA.Guerrero;
import rpg.entities.enemies.enemyTypeB.Mago;
import rpg.entities.enemies.enemyTypeC.Bestia;
import rpg.entities.enemies.enemyTypeD.Lancero;
import rpg.entities.enemies.enemyTypeE.Hechicero;

public class Game {

    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Guerrero Orc", 100);
        Mago mago = new Mago("Mago Oscuro", 80);
        Bestia bestia = new Bestia("Bestia Salvaje", 120);
        Lancero lancero = new Lancero("Lancero Imperial", 90);
        Hechicero hechicero = new Hechicero("Hechicero Infernal", 70);

        guerrero.attack();
        guerrero.receiveDamage(30);

        mago.attack();
        mago.receiveDamage(40);

        bestia.attack();
        bestia.receiveDamage(50);

        lancero.attack();
        lancero.receiveDamage(25);

        hechicero.attack();
        hechicero.receiveDamage(35);
    }
}

package rpg.utils;

import java.util.Random;

public class Randomize {

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

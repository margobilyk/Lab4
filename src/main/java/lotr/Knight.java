package lotr;

import java.util.Random;

public class Knight extends KickStrategy {
    private static Random random = new Random();
    public static final int c = 2 + random.nextInt(11);

    public Knight() {
        super(c);  
    }
}

package lotr;

import java.util.Random;

public class King extends KickStrategy {
    private static Random random = new Random();
    public static final int b = 5 + random.nextInt(11);

    public King() {
        super(b);  
    }
}

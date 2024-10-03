package lotr;

import java.util.Random;

public class KickStrategy extends Character{
    static Random random = new Random();
    private int a ;
    public KickStrategy (int a) {
        super(a, a);
        this.a = a;
    }
    @Override
    public void kick(Character c) {
        int damage = random.nextInt(this.getPower() + 1);  
        c.setHp(c.getHp() - damage);  
        System.out.println(this.getClass().getSimpleName() + " deals " + damage + " damage to " + c.getClass().getSimpleName());
    }
}

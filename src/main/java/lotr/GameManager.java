package lotr;

 public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Fighting between " + c1.getClass().getSimpleName() + " (power = " + c1.getPower() + ", hp = " + c1.getHp() + ") and " +
            c2.getClass().getSimpleName() + " (power = " + c2.getPower() + ", hp = " + c2.getHp() + ")");

        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            return;
        }

        if (c1 instanceof Elf && c2 instanceof Elf) {
            return;
        }
        
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName() + " kicks " + c2.getClass().getSimpleName() + " (power = " + c2.getPower() + ", hp = " + c2.getHp() + ")");

            if (c2.isAlive()) {
                c2.kick(c1);
                System.out.println(c2.getClass().getSimpleName() + " kicks " + c1.getClass().getSimpleName() + " (power = " + c1.getPower() + ", hp = " + c1.getHp() + ")");
            }
        }

        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " wins with (power = " + c1.getPower() + ", hp = " + c1.getHp() + ")!");
        } else {
            System.out.println(c2.getClass().getSimpleName() + " wins with (power = " + c2.getPower() + ", hp = " + c2.getHp() + ")!");
        }
    }
}

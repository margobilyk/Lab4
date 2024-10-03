package lotr;

import java.util.Random;
 public class CharacterFactory {
    private Random r= new Random();

    public Character createCharacter() {
        int choice = r.nextInt(4);

        switch (choice) {
            case 0: return new Hobbit();
            case 1: return new Elf();
            case 2: return new Knight();
            case 3: return new King();
            default: return null;       
        }
    }
}

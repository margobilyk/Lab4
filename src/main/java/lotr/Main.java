package lotr;
public class Main {
    public static void main(String args[]) {
        CharacterFactory f = new CharacterFactory();

        Character c1 = f.createCharacter();
        Character c2 = f.createCharacter();


        GameManager gm = new GameManager();
        gm.fight(c1, c2);
    }
}

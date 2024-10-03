import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lotr.Hobbit;
import lotr.Elf;
import lotr.Knight;
import lotr.King;
import lotr.CharacterFactory;
import lotr.Character;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CharacterFactoryTest {
    private CharacterFactory cf;

    @BeforeEach
    public void init() {
        cf = new CharacterFactory();
    }

    @Test
    public void testCreateCharacter() {
        Character c = cf.createCharacter();
        assertNotNull(c);

        assertTrue(
            c instanceof Hobbit ||
            c instanceof Elf ||
            c instanceof Knight ||
            c instanceof King
        );
        
    }
}
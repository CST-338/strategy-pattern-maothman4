/**
 * The Kobold class represents a specific type of monster with hit points (hp),
 * experience points (xp), and items.
 * This class serves as a base class for specific types of monsters.
 *
 * @author Mohamed Othman
 * @version 1.0
 * @since 2024-07-21
 * @see <a href="https://github.com/CST-338/strategy-pattern-maothman4">GitHub Repository</a>
 */
import java.util.HashMap;

public class Kobold extends Monster {
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Kobold has : " + super.toString();
    }
}

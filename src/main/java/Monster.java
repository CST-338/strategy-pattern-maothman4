/**
 * The Monster class represents a generic monster with hit points (hp),
 * experience points (xp), and items.
 * This class serves as a base class for specific types of monsters.
 *
 * @author Mohamed Othman
 * @version 1.0
 * @since 2024-07-21
 * @see <a href="https://github.com/CST-338/cst338ol-markov-maothman4">GitHub Repository</a>
 */
import java.util.HashMap;
import java.util.Objects;

public abstract class Monster {
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) && Objects.equals(xp, monster.xp) && Objects.equals(maxHP, monster.maxHP) && Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(hp);
        result = 31 * result + Objects.hashCode(xp);
        result = 31 * result + Objects.hashCode(maxHP);
        result = 31 * result + Objects.hashCode(items);
        return result;
    }

    @Override
    public String toString() {
        return "hp=" + hp + "/" + maxHP;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }
}

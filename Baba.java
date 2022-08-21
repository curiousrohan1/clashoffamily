import java.util.ArrayList;

public class Baba extends Player {

    public Baba() {
        super(12000, 5000, new Attack("Taste my arms! v.3.14!", 300, "phys"),
                new Attack("I'm disappointed!", 150, "emo"),
                new Ability(2000, new Effect("e[1000p], e[1000e]"), "Yell"), 0.5, 0.6, 0.7, new ArrayList<Item>());

    }

}

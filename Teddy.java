import java.util.ArrayList;

public class Teddy extends Player {

    public Teddy() {
        super(2000, 10000, new Attack("Nom!", 50, "phys"),
                new Attack("I decorated the carpet with my poop!", 200, "emo"),
                new Ability(2000, new Effect("e[2000e]"), "Food, please!"), 0.7, 0.9, 0.9, new ArrayList<Item>());

    }

}

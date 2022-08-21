import java.util.ArrayList;

public class Neil extends Player {

    public Neil() {
        super(8000, 2500, new Attack("Taste my arms!", 150, "phys"),
                new Attack("I'm going to college soon", 100, "emo"),
                new Ability(15000, new Effect("e[eD]"), "You underwhelm me!"), 0.9, 0.8, 0.5, new ArrayList<Item>());

    }

}

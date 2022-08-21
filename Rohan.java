import java.util.ArrayList;

public class Rohan extends Player {

    public Rohan() {
        super(5000, 500, new Attack("4tt4ck", 100, "phys"),
                new Attack("Remember that thing you did 5 years ago?", 50, "emo"),
                new Ability(5000, new Effect("e[5000p]"), "Wrath of P'Onku"), 0.8, 0.7, 0.8, new ArrayList<Item>());

    }

}

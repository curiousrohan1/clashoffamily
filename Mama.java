import java.util.ArrayList;

public class Mama extends Player {

    public Mama() {
        super(10000, 12000, new Attack("Mama Attack!", 200, "phys"),
                new Attack("I guilt thou!", 200, "emo", new Effect("c[guilt]")),
                new Ability(6000, new Effect("e[5000e], e[guilt]"), "How dare you?"), 0.6, 0.5, 0.6,
                new ArrayList<Item>());
    }

}

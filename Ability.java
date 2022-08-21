public class Ability {
    private int cost;
    private Effect effect;
    private String name;

    public Ability(int cost, Effect effect, String name) {
        this.cost = cost;
        this.effect = effect;
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

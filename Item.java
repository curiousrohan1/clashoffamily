public class Item {
    private String name;
    private Effect effect;
    private int worth;
    private String type;
    private String rarity;

    public Item(String name, Effect effect, int worth, String type, String rarity) {
        this.name = name;
        this.effect = effect;
        this.worth = worth;
        this.type = type;
        this.rarity = rarity;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public void setName(String name) {
        this.name = name;
    }

}

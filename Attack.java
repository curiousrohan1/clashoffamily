/**
 * Attack
 */
public class Attack {

    private String name;
    private int damage;
    private String type;
    private Effect effect;

    public Attack(String name, int damage, String type) {
        this.setName(name);
        this.setDamage(damage);
        this.setType(type);
    }

    public Attack(String name, int damage, String type, Effect effect) {
        this.setName(name);
        this.setDamage(damage);
        this.setType(type);
        this.setEffect(effect);
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
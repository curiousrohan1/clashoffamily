import java.util.ArrayList;

/**
 * Player
 */
public class Player {
    private int physHealth;
    private int emoHealth;
    private Attack physAttack;
    private Attack emoAttack;
    private Ability ability;
    private double accuracy;
    private double mobility;
    private double itemEffectiveness;
    private ArrayList<Item> itemList;

    public Player(int physHealth, int emoHealth, Attack physAttack, Attack emoAttack, Ability ability, double accuracy,
            double mobility, double itemEffectiveness, ArrayList<Item> items) {
        this.setPhysHealth(physHealth);
        this.setEmoHealth(emoHealth);
        this.setPhysAttack(physAttack);
        this.setEmoAttack(emoAttack);
        this.setAbility(ability);
        this.setAccuracy(accuracy);
        this.setMobility(mobility);
        this.setItemEffectiveness(itemEffectiveness);
        this.setItemList(items);
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public double getItemEffectiveness() {
        return itemEffectiveness;
    }

    public void setItemEffectiveness(double itemEffectiveness) {
        this.itemEffectiveness = itemEffectiveness;
    }

    public double getMobility() {
        return mobility;
    }

    public void setMobility(double mobility) {
        this.mobility = mobility;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public Attack getEmoAttack() {
        return emoAttack;
    }

    public void setEmoAttack(Attack emoAttack) {
        this.emoAttack = emoAttack;
    }

    public Attack getPhysAttack() {
        return physAttack;
    }

    public void setPhysAttack(Attack physAttack) {
        this.physAttack = physAttack;
    }

    public int getPhysHealth() {
        return physHealth;
    }

    public int getEmoHealth() {
        return emoHealth;
    }

    public void setEmoHealth(int emoHealth) {
        this.emoHealth = emoHealth;
    }

    public void setPhysHealth(int physHealth) {
        this.physHealth = physHealth;
    }

}
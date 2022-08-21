import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameMain {
    static Scanner input = new Scanner(System.in);
    static Random randGen = new Random(System.currentTimeMillis());
    static ArrayList<Item> totItems = new ArrayList<>();
    static ArrayList<Player> players = new ArrayList<>();
    static Rohan rohan = new Rohan();
    static Teddy teddy = new Teddy();
    static Neil neil = new Neil();
    static Mama mama = new Mama();
    static Baba baba = new Baba();

    public static void main(String[] args) {
        home();
    }

    public static void populateItems() {
        addItems(new Item("Nutella", new Effect("Mm[h50e]"), 50, "Blessing", "Common"), 20);
        addItems(new Item("Plate", new Effect("pa+50"), 50, "Weapon", "Common"), 20);
        addItems(new Item("Economy conversation", new Effect("(Bb + Nl)[h25e], (Rhn + Mm)[e25]"), 100, "Blessing",
                "Common"), 10);
        addItems(new Item("Extra Arrow", new Effect("acc*1.1,pa+10"), 100, "Consumable", "Common"), 10);
        addItems(new Item("Treat", new Effect("Td[lT], Td[h50e]"), 100, "Blessing", "Common"), 10);
        addItems(new Item("School break", new Effect("(Rhn + Nl)[h200e]"), 200, "Blessing", "Rare"), 5);
        addItems(new Item("LEGO trap", new Effect("c[p50, e25]"), 200, "Consumable", "Rare"), 5);
        addItems(new Item("Fake grenade", new Effect("e100e"), 200, "Consumable", "Rare"), 5);
        addItems(new Item("Java Epiphany", new Effect("(Bb + Rhn)[h50e]"), 200, "Blessing", "Rare"), 5);
        addItems(new Item("Squirrel", new Effect("Td[lT], Td[h50e]"), 250, "Blessing", "Rare"), 4);
        addItems(new Item("Rubik's Cube", new Effect("c[lT], c[h100e]"), 250, "Consumable", "Rare"), 4);
        addItems(new Item("Shoes", new Effect("mob*1.1, Mm[h100p]"), 250, "Tool", "Rare"), 4);
        addItems(new Item("Phone", new Effect("c[lT], c[h1000e], guilt"), 250, "Tool", "Rare"), 4);
        addItems(new Item("Coffee", new Effect("pa+100, mob*1.1, ea+100,acc*0.9"), 500, "Consumable", "Rare"), 2);
        addItems(new Item("Gatorade", new Effect("mob*1.1"), 500, "Consumable", "Rare"), 2);
        addItems(new Item("Glasses", new Effect("acc*1.1"), 500, "Tool", "Epic"), 2);
        addItems(new Item("Cook", new Effect("Mm[h100e]"), 1000, "Blessing", "Epic"), 1);
        addItems(new Item("Tax exemption", new Effect("(Bb + Mm)[h100e]"), 1000, "Blessing", "Epic"), 1);
        addItems(new Item("Laptop", new Effect("(Bb + Rhn)[h500e]"), 1000, "Blessing", "Epic"), 1);
        addItems(new Item("Loaded Dice", new Effect("acc*1.1, mob*1.1"), 1000, "Consumable", "Epic"), 1);
        addItems(new Item("Perplexus Epic", new Effect("c[lt*5], c[e10]"), 1000, "Consumable", "Epic"), 1);
        addItems(new Item("Video Game Lore Epiphany", new Effect("Nl[lt], Rhn[lt], Nl[e20],Rhn[h50e]"), 1000,
                "Blessing", "Epic"), 1);
        addItems(new Item("Frying Pan", new Effect("pa+300"), 1000, "Weapon", "Epic"), 1);
        addItems(new Item("LEGO Gun", new Effect("acc*0.9, mob*0.9, pa+500"), 1000, "Weapon", "Epic"), 1);
        addItems(new Item("NERF Gun", new Effect("acc*1.1, mob*0.9, pa+1000"), 1000, "Weapon", "Epic"), 10);
        addItems(new Item("Live Grenade", new Effect("E1000p"), 1000, "Consumable", "Epic"), 5);
        addItems(new Item("Ruler", new Effect("acc*2, mob*2, pa+1000"), 2000, "Weapon", "Legendary"), 2);
        addItems(new Item("Water Bottle", new Effect("pa+50, h100pT, h100eT"), 2000, "Weapon", "Legendary"), 1);
        addItems(new Item("Megaphone", new Effect("ea+5000"), 2000, "Consumable", "Legendary"), 1);
        addItems(new Item("Bamboo stick", new Effect("pa+4000"), 3000, "Weapon", "Mythic"), 1);
        addItems(new Item("Bow and Arrow", new Effect("acc*1.5, mob*0.1, pa+5000"), 5000, "Weapon", "Mythic"), 1);
        addItems(new Item("Epeé", new Effect("pa+5000"), 5000, "Weapon", "Mythic"), 1);
    }

    public static void home() {
        System.out.println(
                "Welcome to Clash of Family! Type \"!begin\" when you want to begin. At any time, you may type \"!stop\" to return here.");
        String command = input.nextLine();
        if (command.equals("!begin")) {
            startGame();
        }
    }

    public static void startGame() {
        System.out.println(
                "|Character|Physical Health|Emotional Health|Physical Attack|Emotional Attack|Ability|Ability Cost|Accuracy|Mobility|Item Effectiveness|");
        renderCharacter(rohan);
        renderCharacter(teddy);
        renderCharacter(neil);
        renderCharacter(mama);
        renderCharacter(baba);
        characterSelect();
        playTurn(0);
    }

    public static void playTurn(int idx) {
        Player currentPlayer = players.get(idx);
        getItem(currentPlayer);
        System.out.println(currentPlayer.getItemList());
        System.out.println("Who do you want to attack(their player number)?");
        int response = input.nextInt();
        System.out.println("What type of attack?");
    }

    public static void getItem(Player currentPlayer) {
        int itemIdx = randGen.nextInt(totItems.size());
        Item selectedItem = totItems.get(itemIdx);
        currentPlayer.getItemList().add(selectedItem);
        totItems.remove(itemIdx);
        System.out.println(
                "Congratulation! You have gotten: " + selectedItem.getRarity() + " " + selectedItem.getName() + "!");
    }

    public static boolean findChar(Player character) {
        for (Player player : players) {
            if (player.equals(character)) {
                return true;
            }
        }
        return false;
    }

    public static void characterSelect() {
        int playerNum = players.size() + 1;
        System.out.println("Player " + playerNum + ", choose your character.");
        String name = input.nextLine();
        switch (name) {
            case "Rohan": {
                if (findChar(rohan)) {
                    System.err.println("Sorry, " + name + " is already taken. Try again!");
                    characterSelect();
                } else {
                    players.add(rohan);
                }
                break;
            }
            case "Teddy": {
                if (findChar(teddy)) {
                    System.err.println("Sorry, " + name + " is already taken. Try again!");
                    characterSelect();
                } else {
                    players.add(teddy);
                }
                break;
            }
            case "Neil": {
                if (findChar(neil)) {
                    System.err.println("Sorry, " + name + " is already taken. Try again!");
                    characterSelect();
                } else {
                    players.add(neil);
                }
                break;
            }
            case "Mama": {
                if (findChar(mama)) {
                    System.err.println("Sorry, " + name + " is already taken. Try again!");
                    characterSelect();
                } else {
                    players.add(mama);
                }
                break;
            }
            case "Baba": {
                if (findChar(baba)) {
                    System.err.println("Sorry, " + name + " is already taken. Try again!");
                    characterSelect();
                } else {
                    players.add(baba);
                }
                break;
            }
            case "!stop": {
                home();
                return;
            }
            default: {
                System.err.println("Sorry, but " + name + " does not exist. Try again.");
                characterSelect();
                break;
            }
        }
        System.out.println("Are there more players?(y/N)");
        String response = input.nextLine();
        if (response.equals("y")) {
            characterSelect();
        } else {
            if (response.equals("!stop")) {
                home();
            }
            return;
        }
    }

    public static void renderCharacter(Player character) {
        String name = "";
        switch (character.getPhysHealth()) {
            case 5000: {
                name = "Rohan";
                break;
            }
            case 8000: {
                name = "Neil";
                break;
            }
            case 2000: {
                name = "Teddy";
                break;
            }
            case 10000: {
                name = "Mama";
                break;
            }
            case 12000: {
                name = "Baba";
                break;
            }
            default: {
                System.err.println("It appears that the character doesn't exist.");
                break;
            }
        }
        String abilityName = character.getAbility().getName() + "(" + character.getAbility().getEffect().getEffect()
                + ")";
        String physAttackName = character.getPhysAttack().getName() + "(" + character.getPhysAttack().getDamage() + ")";
        String emoAttackName = character.getEmoAttack().getName() + "(" + character.getEmoAttack().getDamage() + ")";

        System.out.println("\n|" + name + "|" + character.getPhysHealth() + "|" + character.getEmoHealth() + "|"
                + physAttackName + "|" + emoAttackName + "|" + abilityName + "|" + character.getAbility().getCost()
                + "|" + character.getAccuracy() + "|" + character.getMobility() + "|" + "|"
                + character.getItemEffectiveness() + "|\n");
    }

    public static void addItems(Item item, int frequency) {
        for (int i = 0; i < frequency; i++) {
            totItems.add(item);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        Medic medic = new Medic();

        Hero[] heroes  = new Hero[]{magic, warrior, medic};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("");
        }

    }
}

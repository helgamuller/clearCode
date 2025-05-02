package practice_2.creational.factory.armor;

public abstract class ArmorFactory {
    abstract Armor createArmor();
    public void planFight(){
        Armor armor = createArmor();
        armor.fight();
    }
}

package practice_2.creational.factory.armor;

public class CloseFightArmor extends ArmorFactory{
    @Override
    Armor createArmor() {
        return new Sword();
    }
}

package practice_2.creational.factory.armor;

public class ArrowPowerArmor extends ArmorFactory{
    @Override
    Armor createArmor() {
        return new Bow();
    }
}

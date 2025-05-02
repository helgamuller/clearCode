package practice_2.creational.factory.armor;

public class GunPowerArmor extends ArmorFactory{
    @Override
    Armor createArmor() {
        return new Gun();
    }
}

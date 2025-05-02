package practice_2.creational.factory.armor;

/**
 * В этой задаче нам нужно создать систему для создания различных видов оружия в игре (например, мечи, луки и пистолеты).
 * Все оружие будет иметь общий интерфейс, но конкретные реализации оружия будут различаться.
 * Мы будем использовать фабричный метод, чтобы централизованно создавать объекты оружия.
 */
public class Main {
    public static void main(String[] args) {
        ArmorFactory armorfactory=null;
        String armorType = "sword";

        if(armorType.equals("gun")) {
            armorfactory = new GunPowerArmor();
        }  else if(armorType.equals("bow")){
                armorfactory = new ArrowPowerArmor();
            }else if(armorType.equals("sword")) {
                armorfactory = new CloseFightArmor();
        }

        armorfactory.planFight();
        }
    }


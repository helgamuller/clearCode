package practice_2.creational.builder.character;
//В игре игрок создает персонажа, задавая его параметры, такие как здоровье, урон, броня и магия.
// Паттерн Builder поможет организовать создание персонажа,
// позволяя задавать его параметры поэтапно и не перегружать конструктор класса Character.
public class Main {
    public static void main(String[] args) {
        Character character = new Character.Builder()
                .setMagic(15)
                .setArmor(70)
                .setDamage(100)
               // .setHealth(90)
                .build();

        System.out.println(character);
    }

}

package practice_2.structural.facade.smart_door;
//В нашей системе есть несколько операций для управления дверью:
//Открытие двери.
//Закрытие двери.
//Блокировка двери.
//Каждая операция реализована в своём классе.
// Задача — создать фасад, который будет объединять эти операции и предоставлять простой интерфейс для работы с дверью.
public class Main {
    public static void main(String[] args) {
        SmartDoor door = new SmartDoor(new DoorCloser(), new DoorLocker(), new DoorOpener());
        door.open();
        door.close();
        door.lockOnly();
        door.unlockOnly();

    }
}

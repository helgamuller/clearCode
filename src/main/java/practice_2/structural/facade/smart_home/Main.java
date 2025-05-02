package practice_2.structural.facade.smart_home;
//Описание
//В системе "Умный дом" есть несколько устройств, которые управляют:
//Светом (включить/выключить).
//Кондиционером (включить/выключить).
//Системой безопасности (включить/выключить).
//Клиенту нужно предоставить единый интерфейс для управления (включение/выключение)
// всеми этими устройствами, скрыв детали реализации каждого из них.
// Используем фасад, который объединит все эти операции в один интерфейс.
public class Main {
    public static void main(String[] args) {
        SmartHome home = new SmartHome(new AC(), new Light(), new SecuritySystem());
        home.turnEverythingOff();
        home.turnEverythingOn();
    }

}

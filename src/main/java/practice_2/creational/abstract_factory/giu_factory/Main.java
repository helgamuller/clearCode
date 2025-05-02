package practice_2.creational.abstract_factory.giu_factory;
//Приложение должно работать одинаково на разных платформах (Windows и MacOS),
// но выглядеть по-разному, соответственно стилям каждой платформы.
// Мы будем использовать абстрактную фабрику для создания различных графических элементов
// (например, кнопок, окон и меню), которые будут выглядеть по-разному в зависимости от платформы.
public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory=null;

        String style = "MacOS";

        if(style.equals("MacOS")){
            guiFactory = new MacOSFactory();
        }
        else if (style.equals("Windows")){
            guiFactory = new WindowsFactory();
        }

        guiFactory.createButton().paint();
        guiFactory.createWindow().paint();
        guiFactory.createMenu().paint();

    }
}

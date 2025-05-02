package practice_2.creational.abstract_factory.giu_factory;

import java.awt.*;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}

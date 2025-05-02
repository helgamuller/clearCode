package practice_2.creational.abstract_factory.giu_factory;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }

    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }
}

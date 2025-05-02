package practice_2.creational.abstract_factory.furniture_factory;

public class ModernFactory implements FurnitureFactory{
    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}

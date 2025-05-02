package practice_2.creational.abstract_factory.furniture_factory;

public class ClassicFactory implements FurnitureFactory{
    @Override
    public Table createTable() {
        return new ClassicTable();
    }

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }
}

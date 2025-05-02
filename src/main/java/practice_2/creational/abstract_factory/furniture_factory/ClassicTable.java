package practice_2.creational.abstract_factory.furniture_factory;

public class ClassicTable implements Table{
    @Override
    public void build() {
        System.out.println("Classic Table has been built");
    }
}

package practice_2.creational.abstract_factory.furniture_factory;

/**
 * В мебельном магазине предлагаются два стиля мебели: современный и классический. Клиент должен выбрать только стиль,
 * а конкретные элементы мебели (например, стулья и столы) должны подбираться автоматически в зависимости от выбранного стиля.
 * Мы будем использовать абстрактную фабрику, чтобы разделить создание современных и классических элементов мебели.
 */
public class Main {
    public static void main(String[] args) {
       FurnitureFactory factory=null;

       String style = "Classic";

       if(style.equals("Modern")){
           factory = new ModernFactory();
       }
       else if(style.equals("Classic")){
           factory = new ClassicFactory();
       }

       factory.createChair().build();
       factory.createTable().build();

    }




}

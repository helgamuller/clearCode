package practice_2.creational.builder.order;

//В интернет-магазине клиент может оформить заказ, добавляя товары, указывая скидку и выбирая способ оплаты.
// Паттерн Builder поможет организовать процесс формирования заказа, не перегружая конструктор класса Order
// множеством параметров.
// Это позволяет строить объекты заказов поэтапно, добавляя товары, скидки и способы оплаты по мере необходимости.
public class Main {
    public static void main(String[] args) {
       Order order = new Order.Builder()
               .addGood("Mouse")
               .setDiscount(10)
               .addGood("Keyboard")
               .setPaymentMethod("Visa")
               .build();

        System.out.println(order);

    }
}

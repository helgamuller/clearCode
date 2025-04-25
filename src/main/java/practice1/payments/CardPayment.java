package practice1.payments;

public class CardPayment implements Payable{
    @Override
    public void toPay(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}

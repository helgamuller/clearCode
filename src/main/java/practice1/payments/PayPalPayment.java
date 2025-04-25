package practice1.payments;

public class PayPalPayment implements Payable{
    @Override
    public void toPay(double amount) {
        System.out.println("Оплата PayPal на сумму " + amount);
    }
}

package practice1.payments;

public class CryptoPayment implements Payable{
    @Override
    public void toPay(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}

package practice_1.payments;

public class PaymentProcessor {
    //interface Payble
    //create classes for Payment systems impl payable
    //pass instance of a Inteface into method + amount
    public void processPayment(Payable payment, double amount) {
       payment.toPay(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Payable cardPayment = new CardPayment();
        Payable cryptoPayment = new CryptoPayment();
        Payable payPalPayment = new PayPalPayment();
        paymentProcessor.processPayment(cardPayment, 100);
        paymentProcessor.processPayment(cryptoPayment, 200);
        paymentProcessor.processPayment(payPalPayment, 300);
    }
}

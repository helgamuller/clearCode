package practice_2.creational.factory.transport;

public class GazolinePowerLogistic extends Logistic{
    @Override
    Transport createTransport() {
        return new Car();
    }
}

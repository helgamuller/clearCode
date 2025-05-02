package practice_2.creational.factory.transport;

public class HumanPowerLogistic extends Logistic{
    @Override
    Transport createTransport() {
        return new Bicycle();
    }
}

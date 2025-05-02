package practice_2.creational.factory.transport;

public abstract class Logistic {
    //factory
    abstract practice_2.creational.factory.transport.Transport createTransport();
    public void planRide(){
        Transport transport = createTransport();
        transport.ride();
    }
}

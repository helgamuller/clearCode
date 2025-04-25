package practice1.dip;

public class Sender implements Sendable{
    @Override
    public void send(String message) {
        System.out.println("Message " + message + " is sent");
    }
}

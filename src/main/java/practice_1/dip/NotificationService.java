package practice_1.dip;
//interface Sendable
//Sender implements Sendable
//EmailSender extends Sender
public class NotificationService {

    private Sender sender;
    public NotificationService(Sender sender){
        this.sender = sender;
    }
    public void sendNotification(String message) {
        sender.send(message);
    }

    public static void main(String[] args) {
        Sender sender = new EmailSender();
        NotificationService service = new NotificationService(sender);
        service.sendNotification("hello world!");
    }
}

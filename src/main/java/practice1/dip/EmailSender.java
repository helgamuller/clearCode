package practice1.dip;

class EmailSender extends Sender{
    @Override
    public void send(String message){
        System.out.println("E-mail " + message + " is sent");
    }
    }


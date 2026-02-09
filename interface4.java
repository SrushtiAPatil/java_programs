interface Notification {
    void sendMessage();
}

class EmailNotification implements Notification {

    public void sendMessage() {
        System.out.println("Email notification sent");
    }
}

class SmsNotification implements Notification {

    public void sendMessage() {
        System.out.println("SMS notification sent");
    }
}

public class interface4 {

    public static void main(String[] args) {

      
        Notification notify;

        notify = new EmailNotification();
        notify.sendMessage();

       
        notify = new SmsNotification();
        notify.sendMessage();
    }
}

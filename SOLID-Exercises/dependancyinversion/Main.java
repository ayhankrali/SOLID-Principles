package dependancyinversion;

public class Main {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        NotificationService emailNotificationService = new NotificationService(emailSender);
        emailNotificationService.sendNotification("Hello, this is an email notification!");

        MessageSender smsSender = new SmsSender();
        NotificationService smsNotificationService = new NotificationService(smsSender);
        smsNotificationService.sendNotification("Hello, this is an SMS notification!");

    }
}

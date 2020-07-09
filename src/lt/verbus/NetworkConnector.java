package lt.verbus;

public class NetworkConnector {
    public static void send(Email emailToSend) {
        System.out.println("Email (subject: " + emailToSend.getSubject() +  ")successfully sent to " + emailToSend.getRecipient()
                + "\nEmail body:");
    }
}

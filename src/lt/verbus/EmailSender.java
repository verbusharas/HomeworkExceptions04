package lt.verbus;

import java.util.List;

public class EmailSender {
    public static void sendEmail(List<Email> emails) {
        for (Email email: emails) {
            NetworkConnector.send(email);
        }
    }
}

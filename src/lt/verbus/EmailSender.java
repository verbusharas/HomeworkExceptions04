package lt.verbus;

import java.util.List;

public class EmailSender {
    public static void sendEmail(List<Email> emails) throws InterruptedException {
        for (Email email: emails) {
            while(true) {
                try {
                    NetworkConnector.send(email);
                    break;
                } catch (NoNetworkException e) {
                   Thread.sleep(3000);
                    System.out.println(e.getErrorMessage() + " Retrying in 3 seconds");
                }
            }
        }
    }
}

package lt.verbus;

import java.util.List;

public class EmailSender {
    public static void sendEmails(List<Email> emails) throws InterruptedException {
        for (Email email: emails) {
            while(true) {
                try {
                    NetworkConnector.send(email);
                    break;
                } catch (NoNetworkException e) {
                    System.out.println(e.getErrorMessage() + " Retrying in 3 seconds\n");
                    Thread.sleep(3000);
                }
            }
        }
    }
}

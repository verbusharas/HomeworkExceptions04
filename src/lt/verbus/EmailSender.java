package lt.verbus;

import java.util.List;

public class EmailSender {
    public static void sendEmails(List<Email> emails) throws InterruptedException {
        for (Email email: emails) {
            while(true) {
                try {
                    NetworkConnector.send(email);
                    email.changeStatus(Status.SENT);
                    break;
                } catch (NoNetworkException e) {
                    System.out.println(e.getErrorMessage() + " Retrying in 3 seconds\n");
                    email.changeStatus(Status.RESENDING);
                    Thread.sleep(3000);
                }
            }
        }
    }
}

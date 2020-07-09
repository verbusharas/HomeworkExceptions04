package lt.verbus;

import java.util.Random;

public class NetworkConnector {
    public static void send(Email emailToSend) throws NoNetworkException {
        Random randomizer = new Random();
        int randomNum = randomizer.nextInt(4);
        try {
            int i = 1 / randomNum;
            System.out.println("Email (subject: "
                    + emailToSend.getSubject()
                    + ") successfully sent to "
                    + emailToSend.getRecipient()
                    + "\nEmail body: " + emailToSend.getBody() + "\n");
        } catch (ArithmeticException e) {
            throw new NoNetworkException("ERROR: no network.");
        }

    }
}

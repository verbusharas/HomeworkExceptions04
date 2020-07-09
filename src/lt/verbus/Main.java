package lt.verbus;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        List<Email> emails = Arrays.asList(
                new Email("employee@verbus.lt", "urgent", "Call me. BR Employer"),
                new Email("employer@verbus.lt", "RE: urgent", "OK. BR Employee"),
                new Email("info@verbus.lt", "Unsolicited job application", "Hire me please. BR Very Interested Person"),
                new Email()
        );

        EmailSender.sendEmails(emails);

    }


}

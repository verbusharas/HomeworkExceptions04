package lt.verbus;

public class Email {
    String body;
    String subject;
    String recipient;
    enum status {
        NEW, SENT, FORWARDED
    }
}

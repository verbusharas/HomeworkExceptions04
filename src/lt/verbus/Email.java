package lt.verbus;

public class Email {
    private enum status {
        NEW, SENT, RESENDING
    }
    private String body;
    private String subject;
    private String recipient;
    private status emailStatus;

    public Email(){
        body = "Default body.";
        subject = "Default subject";
        recipient = "Recipient's email address";
        emailStatus = status.NEW;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public String getRecipient() {
        return recipient;
    }

    public status getEmailStatus() {
        return emailStatus;
    }
}

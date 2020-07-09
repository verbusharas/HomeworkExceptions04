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

    public Email(String recipient, String subject, String body){
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
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

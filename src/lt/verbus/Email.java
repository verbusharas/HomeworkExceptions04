package lt.verbus;

public class Email {

    private String body;
    private String subject;
    private String recipient;
    private Status emailStatus;

    public Email(){
        body = "Default body.";
        subject = "Default subject";
        recipient = "username@domain";
        emailStatus = Status.NEW;
    }

    public Email(String recipient, String subject, String body){
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
        emailStatus = Status.NEW;
    }

    public void changeStatus(Status status) {
        this.emailStatus = status;
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

    public Status getEmailStatus() {
        return emailStatus;
    }
}

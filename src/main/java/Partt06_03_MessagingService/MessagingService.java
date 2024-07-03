package Partt06_03_MessagingService;
import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public boolean add(Message message) {
        if (message != null && message.getContent() != null) {
            System.out.println("Content length: " + message.getContent().length()); // Debugging line
            if (message.getContent().length() <= 280) {
                messages.add(message);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}

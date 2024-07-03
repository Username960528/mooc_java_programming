package Partt06_03_MessagingService;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MessagingService service = new MessagingService();

        Message msg1 = new Message("Hello, world!");
        Message msg2 = new Message("This is a very long message designed to test the character limit of the messaging service. It should ffffffffffffffffffdfsfsdfsfsfsffffsfdffdfdfdfdffdfdfdfdfdfdffdfdfdfdfdfdffdfdfdfdfdfdfdfdffdfdfdfdfdfdfdfsfdfdsfdsfsdfdssdfnot be added to the service because it exceeds the 280 character limit set by the add method.");
        Message msg3 = new Message("Good morning!");

        service.add(msg1);
        service.add(msg2);
        service.add(msg3);

        ArrayList<Message> messages = service.getMessages();
        for (Message message : messages) {
            System.out.println(message.getContent());
        }
    }
}

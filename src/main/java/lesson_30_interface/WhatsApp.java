package lesson_30_interface;

public class WhatsApp implements Messenger {


    @Override
    public boolean sendMessage(String message) {
        if(message==null){
            System.out.println("🟩Can't send empty message");
            return false;
        }

        System.out.println("🟩WhatsApp sending a message: " + message);
        return true;
    }

    @Override
    public void readMessage(String message) {
        System.out.println("🟩Message has benn delivered: " + message);
    }

    @Override
    public void exampleFunction() {
        Messenger.super.exampleFunction();

    }
}

package lesson_30_interface;

public class Viber implements Ad, Messenger {

    @Override
    public void showAd(String text) {
        System.out.println("🟪Ad from Viber: " + text);
    }

    @Override
    public boolean sendMessage(String message) {
        if(message==null){
            System.out.println("🟪Can't send empty message");
            return false;
        }

        System.out.println("🟪Viber sending a message: " + message);
        return true;
    }

    @Override
    public void readMessage(String message) {
        System.out.println("🟪Message has benn delivered: " + message);
    }

    @Override
    public void exampleFunction() {
        Ad.super.exampleFunction();

    }
}

package lesson_30_interface;

public interface Messenger {

    boolean sendMessage(String message);

    void readMessage(String message);

    default void exampleFunction() {
        System.out.println("🟩Show message");
    }
}

package lesson_30_interface;

public interface Ad {

    void showAd(String text);

    default void exampleFunction() {
        System.out.println("🟪Show Ad");
    }
}

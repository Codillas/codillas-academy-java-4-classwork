package lesson_30_interface;

public class Main {

    static void main() {

        WhatsApp whatsApp = new WhatsApp();

        boolean result = whatsApp.sendMessage("Hello World");
        boolean result2 = whatsApp.sendMessage(null);
        System.out.println("🟩Message can't be sent: " + result);
        whatsApp.readMessage("Success");
        whatsApp.exampleFunction();

        Viber viber = new Viber();

        viber.sendMessage("Вітаю з днем дня!");
        viber.showAd("Protect screen for phone from Temu just 50 cents");
        viber.exampleFunction();
    }
}

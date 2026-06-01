package lesson_33_optional;

public class ForestIsFullException extends RuntimeException {
    public ForestIsFullException() {
        System.out.println("Наш ліс вже переповнений");
    }
}

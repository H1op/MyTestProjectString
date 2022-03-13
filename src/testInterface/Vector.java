package testInterface;

public interface Vector {
    default void length() {
        System.out.println(4.2);
    }
    default void weigth() {
        System.out.println(3.2);
    }
}

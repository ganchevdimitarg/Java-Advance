package Generics.GenericBox;

public class Box<T> {
    private T text;

    public Box(T text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", text.getClass().getName(), this.text );
    }
}

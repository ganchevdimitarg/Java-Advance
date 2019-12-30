package Generics.GenericSwapMethodString;

public class Swap<T> {
    private T swapList;

    public Swap(T swapList) {
        this.swapList = swapList;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", swapList.getClass().getName(), this.swapList);
    }
}

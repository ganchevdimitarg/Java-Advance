package Generics.JarToT;

import java.util.ArrayDeque;

public class Jar<T> {

    private ArrayDeque<T> steck;

    public Jar() {
        this.steck = new ArrayDeque<>();
    }

    public void add(T e) {
        this.steck.push(e);
    }

    public T remove(){
        return this.steck.pop();
    }
}

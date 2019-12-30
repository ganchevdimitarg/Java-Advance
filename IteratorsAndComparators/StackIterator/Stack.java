package IteratorsAndComparators.StackIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Stack implements Iterable<Integer> {

    private static final int DEF_COUNT = 0;

    private List<Integer> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int couter = stack.size() - 1;

            @Override
            public boolean hasNext() {
                return this.couter >= 0;
            }

            @Override
            public Integer next() {
                return stack.get(this.couter--);
            }
        };
    }

    public void push(List<Integer> e) {
        this.stack.addAll(e);
    }

    public void pop() {
        this.stack.remove(this.stack.size() - 1);
    }

    public int size() {
        return this.stack.size();
    }

}

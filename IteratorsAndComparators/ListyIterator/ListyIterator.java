package IteratorsAndComparators.ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {

    private static final int INT_INDEX = -1;

    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
        this.setIndex();
    }

    private void setIndex() {
        if (this.data.size() == 0) {
            this.index = INT_INDEX;
        } else {
            this.index = 0;
        }
    }


    public boolean move() {
        if (this.index < this.data.size() - 1) {
            index++;
            return true;
        }
        return false;
    }

    public String getInternalItem() {
        if (this.data.size() == 0) {
            throw new IndexOutOfBoundsException("Invalid Operation!");
        }

        return this.data.get(this.index);
    }

    public boolean hasNext() {
        return this.index < this.data.size() - 1;
    }

    @Override
    public Iterator<String> iterator() {
//        return this.data.iterator()
        //това е същото
        return new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < data.size();
            }

            @Override
            public String next() {
                return data.get(this.index++);
            }
        };
    }
}

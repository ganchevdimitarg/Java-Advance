package IteratorsAndComparators.ComparingObjects;

public class PersonTwo implements Comparable<PersonTwo> {

    private String name;
    private int age;


    public String getName() {
        return this.name;
    }

    public PersonTwo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(PersonTwo other) {
        int result = this.name.compareTo(other.name);
        if (result == 0) {
            result = Integer.compare(this.age, other.age);
        }
        return result;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    public int getAge() {
        return this.age;
    }
}

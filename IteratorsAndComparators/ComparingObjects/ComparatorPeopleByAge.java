package IteratorsAndComparators.ComparingObjects;

import java.util.Comparator;

public class ComparatorPeopleByAge implements Comparator<PersonTwo> {
    @Override
    public int compare(PersonTwo first, PersonTwo second) {
        return first.getAge() - second.getAge();
    }
}

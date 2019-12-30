package IteratorsAndComparators.ComparingObjects;

import java.util.Comparator;

public class ComperatorPeopleByName implements Comparator<PersonTwo> {
    @Override
    public int compare(PersonTwo first, PersonTwo second) {
        int result = first.getName().length() - second.getName().length();

        if (result == 0){
            result = first.getName().toLowerCase().charAt(0)- second.getName().toLowerCase().charAt(0);
        }
        return result;
    }
}

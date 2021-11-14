package course04;

import java.util.Comparator;

public class PersonTestComparator implements Comparator<PersonTest> {

    @Override
    public int compare(PersonTest o1, PersonTest o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}

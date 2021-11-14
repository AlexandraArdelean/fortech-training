package course04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTestMain {
    public static void main(String[] args) {


        List<PersonTest> personTestList = new ArrayList<>();
        PersonTest p1 = new PersonTest(185, "Marian");
        PersonTest p2 = new PersonTest(175, "Andreea");


        personTestList.add(p1);
        personTestList.add(p2);
//
//        System.out.println("Before sorting " + personTestList);
//        Collections.sort(personTestList);
//
//        System.out.println("After sorting " + personTestList);

        // using Comparator
        System.out.println("Before sorting " + personTestList);
        PersonTestComparator comparator=new PersonTestComparator();

        personTestList.sort(comparator);
        System.out.println("After sorting " + personTestList);

    }
}
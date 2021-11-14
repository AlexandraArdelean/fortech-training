package course04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        GenericClassTest <Integer>ob1= new GenericClassTest<>(10);
//        System.out.println(ob1);
//
//        GenericClassTest<String> ob2 = new GenericClassTest<>("abc");
//        System.out.println(ob2);

        List<String> list = new ArrayList<String>();
        list.add("_x");
        list.add("_Y");
        list.add("x1");
        list.add(null);
        list.add("X2");
        list.add("&1");
        list.add("&2");
        list.add("B");
        list.add("");
    }
}

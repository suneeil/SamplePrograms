package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIndexEx {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("B");li.add("A");li.add("C");li.add("A");li.add("D");li.add("");li.add("E");li.add("F");li.add("G");
        System.out.println(li);
        System.out.println(li.lastIndexOf("A"));
        System.out.println(li.indexOf("A"));
        li.set(li.lastIndexOf("A"), "X");
        System.out.println(li);
        System.out.println(li.indexOf(""));
    }
}

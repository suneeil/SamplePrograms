package SamplePrograms.src.collections;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VectorExample {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        IntStream.rangeClosed(1, 10).forEach(n -> v.add(n));
        System.out.println(v);


        List<Integer> collect = v.stream().filter(n -> (n % 2) == 0).collect(Collectors.toList());
        System.out.println("Collect: " + collect);

        Enumeration<Integer> elements = v.elements();
        while (elements.hasMoreElements()) {
            Integer integer = elements.nextElement();
            if ((integer % 2) == 0) {
                System.out.println(integer);
            }
        }
    }
}

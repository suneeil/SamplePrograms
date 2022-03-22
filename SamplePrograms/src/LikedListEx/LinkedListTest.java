package SamplePrograms.src.LikedListEx;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(30);
        ll.add(50);
        ll.add(20);
        System.out.println(ll);
        ll.add(0, 89);
        System.out.println("After add: " + ll);
        ll.set(0, 99);
        System.out.println("After set: " + ll);
        ll.remove(3);
        System.out.println("After remove: " + ll);
        ll.removeLast();
        System.out.println("After remove Last: " + ll);
        ll.removeFirst();
        System.out.println("After remove First: " + ll);

    }

}

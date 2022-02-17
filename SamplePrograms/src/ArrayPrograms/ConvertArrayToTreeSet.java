package ArrayPrograms;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConvertArrayToTreeSet {
    public static void main(String[] args) {
        int[] arr2 = {2, 2, 10, 9, 3, 7, 4, 8, 5, 6, 5, 1};
        TreeSet<Integer> collect1 = Arrays.stream(arr2).boxed().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect1);


        System.out.println(collect1.first());
        System.out.println(collect1.last());
        System.out.println(collect1.tailSet(5));
        System.out.println(collect1.headSet(6));
        System.out.println(collect1.descendingSet());
        System.out.println(collect1.tailSet(5));
        System.out.println(collect1.headSet(6));
    }
}

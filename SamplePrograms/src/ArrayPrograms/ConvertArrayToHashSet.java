package SamplePrograms.src.ArrayPrograms;


import java.util.*;
import java.util.stream.Collectors;

public class ConvertArrayToHashSet {
    public static void main(String[] args) {
        int[] arr2 = {2, 2, 10, 9, 3, 7, 4, 8, 5, 6, 5, 1};
        HashSet<Integer> collect2 = Arrays.stream(arr2).boxed().collect(Collectors.toCollection(HashSet::new));
        System.out.println(collect2);

        TreeSet<Integer> collect1 = Arrays.stream(arr2).boxed().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect1);
    }
}

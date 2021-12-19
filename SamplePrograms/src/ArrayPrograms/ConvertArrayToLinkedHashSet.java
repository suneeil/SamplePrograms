package ArrayPrograms;

import arraysUtilClass.ArraysAsList;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertArrayToLinkedHashSet {

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 10, 9, 3, 7, 4, 8, 5, 6, 5, 1};

        LinkedHashSet<Integer> s = new LinkedHashSet(Arrays.stream(arr1).boxed().collect(Collectors.toCollection(ArrayList::new)));
        System.out.println(s);


    }
}

package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class ConvertArrayToHashSet {

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 10, 9, 3, 7, 4, 5, 6, 5, 1};

        LinkedHashSet<Integer> s = new LinkedHashSet(Arrays.stream(arr1).boxed().collect(Collectors.toCollection(ArrayList::new)));
        System.out.println(s);
    }
}

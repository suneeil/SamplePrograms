package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArray {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5};
        int[] arr2 = {6, 8, 7, 9};
        mergeArr(arr1, arr2);
        mergeTwo(arr1, arr2);
    }


    public static void mergeArr(int[] Larr, int[] Rarr) {
        int LarrLen = Larr.length;
        int RarrLen = Rarr.length;
        int newLength = LarrLen + RarrLen;
        int[] newArr = new int[newLength];
        int IL = 0, IR = 0, IK = 0;

        while (IL < LarrLen) {
            newArr[IK] = Larr[IL];
            IL++;
            IK++;
        }
        System.out.println("IK" + IK);
        while (IR < RarrLen) {
            newArr[IK] = Rarr[IR];
            IR++;
            IK++;
        }
        System.out.println(Arrays.toString(newArr));
    }


    public static void mergeTwo(int[] arr1, int[] arr2) {
        List<Integer> integers1 = Arrays.asList(Arrays.stream(arr1).boxed().toArray(Integer[]::new));
        List<Integer> integers2 = Arrays.asList(Arrays.stream(arr2).boxed().toArray(Integer[]::new));
        //List<int[]> li1 = Arrays.asList(arr1);
        //List<int[]> li2 = Arrays.asList(arr2);
        List<Integer> li = new ArrayList<>();
        li.addAll(integers1);
        li.addAll(integers2);
        System.out.println(li);


    }

}

package SamplePrograms.src.arraysUtilClass;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 22, 43, 12, 34, 21, 33, 65, 36, 78, 39, 45};
        int key = 45;
        searchArr(arr, key);


    }

    public static void searchArr(int[] arr, int key) {
        Arrays.sort(arr);
        int result = Arrays.binarySearch(arr, key);
        System.out.println("Total elements in Array: " + arr.length);
        System.out.println("Smallest Num in Array: " + arr[0]);
        System.out.println("Biggest Num in Array: " + arr[arr.length - 1]);
        if (result < 0)
            System.out.println("Not in Array");
        else
            System.out.println("Found in position after sorting: " + result);
    }

    public static void binarySearch(int arr[], int low, int high, int key) {
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("Element is not found!");
        }
    }
}

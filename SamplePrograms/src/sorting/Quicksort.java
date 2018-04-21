 package sorting;

import java.util.Arrays;

 public class Quicksort  {
     private int[] numbers;
     private int tot;

     public static void main(String args[]){
    	 Quicksort s = new Quicksort();
    	 int[] arr = {3,5,2,1,8,7,9};
    	 System.out.println(Arrays.toString(arr));
    	 s.sort(arr);
    	 System.out.println(Arrays.toString(arr));
     }
     
     public void sort(int[] values) {
             // check for empty or null array
             if (values ==null || values.length==0){
                     return;
             }
             this.numbers = values;
             tot = values.length-1;
             quicksort(0, tot);
     }

     private void quicksort(int low, int high) {
             int i = low;
             int j = high;
             
             // Get the pivot element from the middle of the list
             int pivot = numbers[low + (high-low)/2];

             // Divide into two lists
             while (i <= j) {
                     // If the current value from the left list is smaller than the pivot
                     // element then get the next element from the left list
                     while (numbers[i] < pivot) {
                             i++;
                     }
                     // If the current value from the right list is larger than the pivot
                     // element then get the next element from the right list
                     while (numbers[j] > pivot) {
                             j--;
                     }

                     // If we have found a value in the left list which is larger than
                     // the pivot element and if we have found a value in the right list
                     // which is smaller than the pivot element then we exchange the
                     // values.
                     // As we are done we can increase i and j
                     if (i <= j) {
                             exchange(i, j);
                             i++;
                             j--;
                     }
             }
             // Recursion
             if (low < j)
                     quicksort(low, j);
             if (i < high)
                     quicksort(i, high);
     }

     private void exchange(int i, int j) {
             int temp = numbers[i];
             numbers[i] = numbers[j];
             numbers[j] = temp;
     }
}
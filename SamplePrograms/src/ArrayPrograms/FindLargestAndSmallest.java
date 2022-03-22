package SamplePrograms.src.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import SamplePrograms.src.arraysUtilClass.ArraysAsList;

public class FindLargestAndSmallest {

	public static void main(String[] args) {
		int[] arr = {-10,-2,-20,-30,-100,-99};
		findLS(arr);
		findLS2(arr);
		findLS3(arr);
	}

	
	public static void findLS(int[] arr){
		System.out.println(arr.length);
		if(arr.length<=0){
			System.out.println("Empty Array");
			return;
		}

		int small = Integer.MAX_VALUE;
		int large = Integer.MIN_VALUE;
		
		for(int n: arr){
			if(n>large)
				large = n;
			else if(n<small)
				small = n;
		}
		
		System.out.println("Large: " + large);
		System.out.println("Small: " + small);
	
	}
	
	
	public static void findLS2(int[] arr){
		Arrays.sort(arr);
		System.out.println("----------------------------------------");
		System.out.println("Largest: "+arr[arr.length-1]);
		System.out.println("Smallest: "+arr[0]);
		
	}

	public static void findLS3(int[] arr) {
		System.out.println("----------------------------------------");
		ArrayList<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

		Integer max = Collections.max(collect);
		Integer min = Collections.min(collect);
		System.out.println("Largest: " + max);
		System.out.println("Smallest: " + min);

	}
	
	
}

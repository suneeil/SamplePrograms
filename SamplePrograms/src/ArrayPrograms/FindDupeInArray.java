package SamplePrograms.src.ArrayPrograms;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindDupeInArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,3,2,3,3};
		Integer[] arr1 = {2,3,1,5,6,6,1,2,2,4,6,7};
		findDupe(arr);
		dupe_Set(arr1);

	}

	public static void findDupe(int[] arr){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int n : arr){
			if(map.containsKey(n)){
				map.put(n, map.get(n)+1);
			}else
				map.put(n,1);
		}
		System.out.println("Map: " + map);

		map.entrySet().iterator().forEachRemaining(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()) );




	/*	integers.stream().filter(i -> Collections.frequency(integers, i) > 1).collect(Collectors.toSet()).forEach(System.out::println);


		Arrays.asList(arr).forEach(i -> {
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);

		});*/


		/*Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		Iterator<Entry<Integer,Integer>> itr = entrySet.iterator();
		Entry<Integer,Integer> entry;
		while(itr.hasNext()){
			entry = itr.next();
			if(entry.getValue()>1){
				System.out.println(entry.getKey()+": "+entry.getValue() );
			}
		}*/

	}

	public static void dupe_Set(Integer[] arr){
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
		HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
		al.removeAll(set); 
		System.out.println("Using Set: " + set);
	}
	
}

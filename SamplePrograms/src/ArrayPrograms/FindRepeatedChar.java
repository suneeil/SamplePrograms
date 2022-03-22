package SamplePrograms.src.ArrayPrograms;

import java.util.HashMap;

public class FindRepeatedChar {

	public static void main(String[] args) {
		
		findRepChar("TEST");
	}
	
	public static void findRepChar(String str){
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : str.toCharArray()){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		
		
		
		map.forEach((k,v)->{
			if(v>1)
				System.out.println(k+":"+v);
		});
	}
}

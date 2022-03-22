package SamplePrograms.src.stringProg;

import java.nio.CharBuffer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindOccuranceOfChar {

	public static void main(String[] args) {
		String str = "who are you";
		findOccu_1(str, 'y');
		char[] charr = str.toCharArray();
		System.out.println("-----------");
		usingStreams(str, 'y');
		
	}

	public static void findOccu_1(String str, char ch){
		int count = 0;
		while(str.indexOf(ch)>=0){
			count ++;
			str = str.substring(str.indexOf(ch)+1);
		}
		System.out.println(count);
	}

	public static void usingStreams(String str, Character ch) {
		long count = str.chars().filter(c -> c == ch).count();
		System.out.println(ch + " character appears : " + count);


		ArrayList<Character> al = new ArrayList<>();
		al.add('w');al.add('h');al.add('o');al.add(' ');
		al.add('a');al.add('r');al.add('e');al.add(' ');
		al.add('y');al.add('o');al.add('u');





		int frequency = Collections.frequency(al, ch);
		System.out.println(frequency);



		List<Character> list = str.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());

	}

	
}

package SamplePrograms.src.stringProg;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		System.out.println("Enter");
		 Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        
	        System.out.println(S.substring(start, end));
	 
	 
	}

}

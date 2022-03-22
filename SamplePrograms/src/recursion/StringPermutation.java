package SamplePrograms.src.recursion;


public class StringPermutation {
	  public static void main(String args[]) {
		  
		  
	    permuteString("", "ABC");
	  }

	  public static void permuteString(String beginningString, String endingString) {
		  
	    if (endingString.length() == 0)//checking if there is only one character
	      System.out.println(beginningString);//i.e. If you send 'A' you get the result as 'A'
	    else
	      for (int i = 0; i < endingString.length(); i++) {
	        	String newString = endingString.substring(0, i) + endingString.substring(i + 1);
	        	permuteString(beginningString + endingString.charAt(i), newString);
	      
	      }
	  }
	}
/**/
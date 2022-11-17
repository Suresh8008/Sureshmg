package Besics;

//import org.checkerframework.checker.units.qual.radians;

public class Palindrom {

	public static void main(String[] args) {
		String str = "rada", rev = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      rev= rev + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(rev.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	  
	}
}

	
	




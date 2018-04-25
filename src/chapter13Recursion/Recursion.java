package chapter13Recursion;

public class Recursion {

	// This is a utility class for defining my recursive functions
	// See Malik book chapter 13
	
	public static double factorial( double n ) {
		
		if( n <= 0 )  // Base case
			return 1;
		
		// recursion!  
		return n * factorial( n-1 );
	}
	
	// Chapter 13 - Exercise 1
	public static String strWedge(int n) {
		

		String sResult = "";
		
		if( 0 == n )  // end Case
			return "";
	
		// general case
		for(int i=0; i<n; i++)  // n stars
			sResult += "*";
		sResult += "\n";  // end of line
		
		sResult += strWedge(n-1);  // recursion here!
		
		for(int i=0; i<n; i++) // n stars
			sResult += "*";
		sResult += "\n";  // end of line	
		
		return sResult;
	}
	
	
	
	
}

package problemSolving;
/*
 * Static initialization blocks are executed when the class is loaded,
 *  and you can initialize static variables in those blocks.
 *  If both values are greater than zero, then the main method must output
 *   the area of the parallelogram. Otherwise, print
 *    "java.lang.Exception: Breadth and height must be positive" without quotes.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializer {

	static Scanner s = new Scanner(System.in);
	public static int B ;
	public static int H ;
	static boolean flag=true;

	static{
		System.out.println("Enter breadth and Height");
		 B=s.nextInt();
		 H=s.nextInt();
		    
		  if ((B<=100 && B>=0)&& (H<=100 && H>=0)){
		    flag=true;
		    }
		    
		    else if ((B <=0) || (H <=0) ){
		    System.out.println("java.lang.Exception: Breadth and height must be positive"); 
		    flag=false;
		    }
	    

	}



	
	
	
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		

	}

}

/*
Test case 1:
1
3
*/
/*
Test case 2:
-1
2
*/


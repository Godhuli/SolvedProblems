package conceptOopDataStructure;

/*
 *Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 *For each input variable  and appropriate primitive , you must determine if the given primitives are capable of 
 *storing it. If yes, then print:
		n can be fitted in:
 		* dataType
 */

import java.util.*;
import java.io.*;


public class DatatypeCapacity {

	 public static void main(String []argh)
	    {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter loop size");
	     int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	            	System.out.println("Enter number");
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if(x>=-128 && x<=127){
	                System.out.println("* byte");
	                System.out.println("* short");
	                System.out.println("* int");
	                System.out.println("* long");
	                }
	                
	                //Complete the code
	                else if (x >= ((Math.pow(2,16)/2)*-1) && x<= ((Math.pow(2,16)/2)-1)){
	                System.out.println("* short");
	                System.out.println("* int");
	                System.out.println("* long");
	                }
	                
	                else if (x >= ((Math.pow(2,32)/2)*-1) && x<= ((Math.pow(2,32)/2)-1)){              
	                System.out.println("* int");
	                System.out.println("* long");
	                }
	                
	                else if (x >= ((Math.pow(2,64)/2)*-1) && x<= ((Math.pow(2,64)/2)-1)){
	                System.out.println("* long");
	                }
	                


	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }

	        }
	    }

}

//Test Case:
/*
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
*/

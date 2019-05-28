package problemSolving;
/*For each query, print the corresponding series on a new line. 
 * Each series must be printed in order as a single line of  space-separated integers.
(q+2^0*b),(q+2^0*b + 2^1*b), (q+2^0*b + 2^1*b+2^2*b)...................... (q+2^0*b + 2^1*b+2^n-1*b)
*/

import java.util.Scanner;

public class DisplaySeriesOfPattern {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter no. of loop, a, b and n");
	        int t=in.nextInt();  
	        for(int i=0;i<t;i++){            
	            int a = in.nextInt();
	            
	            int b = in.nextInt();
	            
	            int n = in.nextInt();
	            //System.out.println();

	            if ((a>=0 && a<=50) && (b>=0 && b<=50)){
	                
	                if ((n>=1) && (n<=15 )){
	                    int ans = (int)(a + Math.pow(2,0)*b);
	                    System.out.print(ans+" ");              
	                    for(int seq=1; seq<n;seq++){
	                    ans=(int) (ans+ Math.pow(2,seq)*b);                 
	                    System.out.print(ans+" ");                   
	                    }
	                    System.out.println();
	                }
	            }
	            
	          
	        }
	        
	        in.close();
		
		
		
		
		
		

	}

}

/* Test Cases:
 2
0 2 10
5 3 5
*/

/*Expected output:
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 * 
 * 
*/

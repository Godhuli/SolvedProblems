package conceptOopDataStructure;
import java.util.*;
import java.security.*;

public class ParseDataTypes {
	
	public static void main(String[] args) {
		 try {
			   Scanner in = new Scanner(System.in);
			   System.out.println("Enter an integer value");
			   int n = in .nextInt();
			   in.close();
			   //String s=???; Complete this line below
			String s = "";
			   //Write your code here
			   
			       if (n >=-100 || n<=100){
			       s = new Integer(n).toString();
			       //System.out.println(" hello1");

			   }
			   else if (n <-100 || n>100){
			    System.out.println("Should in the range -100 to 100");
			    System.exit(0);
			   }
			   
			   
			   if (n == Integer.parseInt(s)) {
			    System.out.println("Good job");
			   } else {
			    System.out.println("Wrong answer.");
			   }
		
	}
		 
		 catch (DoNotTerminate.ExitTrappedException e) {
			   System.out.println("Unsuccessful Termination!!");
			  }
}
}
//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

public static class ExitTrappedException extends SecurityException {

private static final long serialVersionUID = 1;
}

public static void forbidExit() {
final SecurityManager securityManager = new SecurityManager() {
 @Override
 public void checkPermission(Permission permission) {
  if (permission.getName().contains("exitVM")) {
   throw new ExitTrappedException();
  }
 }
};
System.setSecurityManager(securityManager);
}
}

/*Test Case 1:
 * 0
 * Test Case 2:
 * 100
 * Test Case 3:
 * 20
 * Test Case 4:
 * -101
 * Test Case 5:
 * 200
 * 
 */


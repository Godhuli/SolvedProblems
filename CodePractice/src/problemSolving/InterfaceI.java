package conceptOopDataStructure;
import java.util.*;

interface AdvanceArithmetic{
	int divisor_sum(int n);
}

class MyCalculator implements AdvanceArithmetic{
	int divisor =0;
	int sum=0;
	public int divisor_sum(int num){
		if(num<=1000){
			for(int i=1;i<num;i++){
				if(num%i==0){
					divisor =num/i;
					sum =sum+i;
				}
			}
		}
		return sum;
	}

}



public class InterfaceI {

	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
		System.out.print("Enter a number: ");
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n)+"\n");
		sc.close();
	}

	//ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implements
	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces =o.getClass().getInterfaces();
		for(int i =0;i<theInterfaces.length;i++){
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
		
	}

}

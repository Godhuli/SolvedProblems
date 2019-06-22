package conceptOopDataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {

	static Iterator func(ArrayList mylist){
		Iterator it = mylist.iterator();
		while(it.hasNext()){
			Object element = it.next();
			if(element instanceof String)
				break;
		}
		return it;
	}
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of numeric elements");
		int n = sc.nextInt();
		System.out.println("Enter numbers");
		
		
		for (int i =0;i<n;i++){
			mylist.add(sc.nextInt());
		}
		
		mylist.add("###");
		System.out.println("Enter no. of string elements");
		int m = sc.nextInt();
		System.out.println("Enter strings");
		
		for(int i=0;i<m;i++){
			mylist.add(sc.next());
		}
		
		Iterator it =func(mylist);
		while(it.hasNext()){
			Object element = it.next();
			System.out.println((String)element);
		}
		
		
		

	}

}

package conceptOopDataStructure;
/*
 * there are  socks with colors . 
 * There is one pair of color  and one of color . There are three odd socks 
 * left, one of each color. The number of pairs is .
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter array elements");
		
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			//System.out.println(arr[i]);
		}
		

		HashMap<Integer, Integer> arrValuesMap = new HashMap<Integer, Integer>();
		for(Integer value:arr){
			//Integer count = arrValuesMap.get(value);
			Integer count = 1;
			if(count == 1){
				arrValuesMap.put(2, value);
			}
			else
				arrValuesMap.put(++count, value);
		}
		for(Map.Entry m:arrValuesMap.entrySet()){
			
			System.out.println(m.getKey()+" "+ m.getValue());
			
		}
		

	}

}

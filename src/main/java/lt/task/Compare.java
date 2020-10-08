package main.java.lt.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Compare {
	
	public static void compareByLast8Bits( int A, int B, int rows, Object[] arrayA, Object[] arrayB) {
		System.out.println("Su parametrais "+ A +" ir "+ B +", rezultatas " + Compare.compare(arrayA, arrayB, rows));
	}
	
	static int compare(Object[] arrayA, Object[] arrayB, int n) { 
		ArrayList<ArrayList<String>> mainlist = new ArrayList<ArrayList<String>>();
		for (int i = 0; i < n; i++) {
			ArrayList<String> binaryList = new ArrayList<String>();
			
			String binaryA = arrayA[i].toString();
			String last8_A = binaryA.substring(binaryA.length() - 8);
			binaryList.add(last8_A);
			
			String binaryB = arrayB[i].toString();
			String last8_B = binaryB.substring(binaryB.length() - 8);
			binaryList.add(last8_B);
			
			Set<String> set = new HashSet<>();
			for (String b : binaryList) set.add(b);
			
			if(set.size() == 1) mainlist.add(binaryList);
		} 
		return mainlist.size();
	} 
}

package main.java.lt.task;

public class Parallel {
	static void printParallelArray(Object[] arrayA, Object[] arrayB, int n) { 
		for (int i = 0; i < n; i++) { 
			System.out.println("A " + arrayA[i]); 
			System.out.println("B " + arrayB[i]);
			System.out.println(" "); 
		} 
	}
}

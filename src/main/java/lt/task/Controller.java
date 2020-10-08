package main.java.lt.task;

import java.util.ArrayList;
import java.util.Iterator;

public class Controller {

	private static int constA = 16807;
	private static int constB = 48271;
	
	public static void generatorController(int A, int B, int rows) {
		// Generating numbers
		ArrayList<Long> genA = Generator.generateNumber(A, constA, rows);
		ArrayList<Long> genB = Generator.generateNumber(B, constB, rows);
		
		Generator.printGeneratedNumbers(genA.iterator(), genB.iterator());
		
		// Converting generated values into binary string
		ArrayList<String> binA = new ArrayList<String>();
		ArrayList<String> binB = new ArrayList<String>();
		
		Converter.binaryConverter(genA, genB, binA, binB);
		
		Object[] binToArray_A = binA.toArray(); 
		Object[] binToArray_B = binB.toArray(); 
		
		Parallel.printParallelArray(binToArray_A, binToArray_B, rows);
		
		// Compare whether their last 8 bits match
		Compare.compareByLast8Bits(A, B, rows, binToArray_A, binToArray_B);
	}
}

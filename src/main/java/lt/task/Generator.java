package main.java.lt.task;

import java.util.ArrayList;
import java.util.Iterator;

public class Generator {
	
	private static int division = 2147;

	public static ArrayList<Long> generateNumber(long number, int factor, int rows) {
		ArrayList<Long> numberList = new ArrayList<Long>();
		for(int i=0; i<rows; i++) {
			long multiplication = number * factor;
			numberList.add(multiplication);
			long rezult = multiplication%division;
			number = rezult;
		}
		return numberList;
	}
	
	public static void printGeneratedNumbers(Iterator<Long> A, Iterator<Long> B) {
		System.out.println(String.format("%20s","Generatorius A") + String.format("%20s","Generatorius B"));
		while(A.hasNext() && B.hasNext()) {
			System.out.println(String.format("%20s",A.next()) + String.format("%20s",B.next()));
		}System.out.println(" ");

		System.out.println("Skaièiø dvejetainis atvaizdavimas");
		System.out.println(" ");
	}
}

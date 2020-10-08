package main.java.lt.task;

import java.util.ArrayList;

public class Converter {
	public static void binaryConverter(ArrayList<Long> genA, ArrayList<Long> genB, ArrayList<String> binA, ArrayList<String> binB) {
		for(Long t: genA) {
			String binary = String.format("%32s", Long.toBinaryString(t)).replace(' ', '0');
			binA.add(binary);
		}
		
		for(Long t: genB) {
			String binary = String.format("%32s", Long.toBinaryString(t)).replace(' ', '0');
			binB.add(binary);
		}
	}
}

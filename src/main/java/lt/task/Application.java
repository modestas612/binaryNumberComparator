package main.java.lt.task;

import java.util.Scanner;

public class Application {

	private static Scanner sc;

	public static void main(String[] args) {
		
		// scanner implementation
		sc = new Scanner(System.in);

		System.out.print("Įveskite skaičių A: ");
		int A = sc.nextInt();
		System.out.print("Įveskite skaičių B: ");
		int B = sc.nextInt();
		System.out.print("Įveskite palyginimų kiekį: ");
		int rows = sc.nextInt();
		System.out.println(" ");
		
		Controller.generatorController(A, B, rows);
	}
}

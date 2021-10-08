package com.haderer;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the 1st number: ");
		double inputA = HelperClass.scannerDoubleCheck(scanner);

		System.out.println("Enter the 2nd number: ");
		double inputB = HelperClass.scannerDoubleCheck(scanner);

		System.out.println("Select an operator: +,-,*,/");
		String operator = HelperClass.scannerCheckOperator(scanner);

		Calculator calc = new Calculator(operator, inputA, inputB);
		double result = calc.calculate();
		System.out.println("Result: " + result);

		scanner.close();
	}
}

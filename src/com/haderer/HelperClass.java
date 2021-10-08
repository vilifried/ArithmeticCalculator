package com.haderer;

import java.util.Scanner;

public final class HelperClass {

	public static double scannerDoubleCheck(Scanner scanner) {
		while (!scanner.hasNextDouble()) {
			System.out.println("Enter a valid number!");
			scanner.nextLine();
		}
		return scanner.nextDouble();
	}

	public static String scannerCheckOperator(Scanner scanner) {
		String operator = scanner.next();

		while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {

			System.out.println("Invalid operator! Please select an valid operator: +,-,*,/");
			operator = scanner.next();
		}
		return operator;
	}
}

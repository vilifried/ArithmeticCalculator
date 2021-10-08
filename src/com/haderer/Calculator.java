package com.haderer;

import java.util.Scanner;

final public class Calculator {

	private double result;
	private String operator;
	private double inputA;
	private double inputB;

	public Calculator(String operator, double inputA, double inputB) {
		this.operator = operator;
		this.inputA = inputA;
		this.inputB = inputB;
	}

	private void sum() {
		this.result = this.inputA + this.inputB;
	}

	private void subtract() {
		this.result = this.inputA - this.inputB;
	}

	private void multiply() {
		this.result = this.inputA * this.inputB;
	}

	private void divide() {
		this.result = this.inputA / this.inputB;
	}

	public double calculate() {

		switch (this.operator) {
		case "+":
			this.sum();
			break;

		case "-":
			this.subtract();
			break;

		case "*":
			this.multiply();
			break;

		case "/":
			this.divide();
			break;

		default:
			break;
		}

		return this.result;

	}

	

}

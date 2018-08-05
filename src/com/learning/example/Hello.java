package com.learning.example;

public class Hello {

	public static void main(String args[]) {

		System.out.print("*****************************Hello world********************************");

		System.out.println("Fibonacci series up to 100:");

		int fib1 = 0;
		int fib2 = 1;
		
		System.out.print(fib1 + ", ");

		while (fib2 <= 100) {
			System.out.print(fib2 + ", ");
			int temp = fib1 + fib2;
			fib1 = fib2;
			fib2 = temp;
		}
	}
}

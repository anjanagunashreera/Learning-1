package com.learning.example;

/**
 * Compile Time polymorphism - Method overloading
 * 
 * @author 611777858
 *
 */
class Computation {

	int getSum(int a, int b) {

		System.out.println("called in int");

		return a + b;
	}

	float getSum(float a, float b) {
		System.out.println("called in float");
		return a + b;
	}

	double getSum(double a, double b) {
		System.out.println("called in double");
		return a + b;
	}

	String getSum(String a, String b) {

		System.out.println("called in string");

		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		int sum = num1 + num2;
		return Integer.toString(sum);
	}

	public int optionalParams(int x, int... b) {
		System.out.println("Got " + b.length + " parameter/s");
		return 0;
	}
}

/**
 * 
 * @author Gopinatha PR
 *
 */
public class CompileTime {

	public static void main(String[] args) {

		Computation c = new Computation();

		System.out.println("Get Sum of ints :" + c.getSum(1, 2));

		System.out.println("*******************************************");

		System.out.println("Get Sum of floats :" + c.getSum((float) 1.0, (float) 2.0));

		System.out.println("*******************************************");

		System.out.println("Get Sum of doubles :" + c.getSum(1.0, 2.0));

		System.out.println("*******************************************");

		System.out.println("Get Sum of strings :" + c.getSum("1", "2"));

		System.out.println("*******************************************");

		System.out.println(c.optionalParams(1));
		System.out.println(c.optionalParams(1, 2));
		System.out.println(c.optionalParams(1, 2, 3));
		System.out.println(c.optionalParams(1, 2, 3, 4));
	}

}

package com.learning.example;

public class Condition {
	public static void main(String args[]) {
		int n=21;
		if (n % 2 == 1) {
			System.out.println("weired");
		} else {
			if (n >= 2 || n <= 5)
				System.out.println("not weired");
			else if (n > 6 || n <= 20)
				System.out.println("not weired");
			else
				System.out.println("not weired");
		}
	}
}

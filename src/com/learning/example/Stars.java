package com.learning.example;

/**
 * 
 * @author 611777858
 *
 */
public class Stars {
	public static void main(String[] args) {
		int k = 5;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 10; j++) {
				if (j < k) {
					System.out.print(" ");
				} else {
					if (j <= 5)
						System.out.print("*");
				}
			}
			for (int j = 10; j > 0; j--) {
				if (j > 5) {
					if (j < k)
						System.out.print("*");
				}
			}
			k--;
			System.out.println();

		}
	}
}

/*
 ***
 *****
 *******
 **********/

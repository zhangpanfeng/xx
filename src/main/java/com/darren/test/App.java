package com.darren.test;

/**
 * Hello world!
 *
 */
public class App {
	private static final int DEEP = 121;
	private static int array[][] = new int[21][DEEP];

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < DEEP; j++) {
				array[i][j] = (i + j) * i * j / 2;
			}

		}
		System.out.println();
		for (int i = 7; i < 14; i++) {
			for (int j = 0; j < DEEP; j++) {
				array[i][j] = (i + j) * i * j / 2;
			}
		}
		System.out.println();
		for (int i = 14; i < 21; i++) {
			for (int j = 0; j < DEEP; j++) {
				array[i][j] = (i + j) * i * j / 2;
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("Total : " + (end - start));
	}
}

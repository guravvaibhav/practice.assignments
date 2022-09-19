package practice.assignments.array;

import java.util.Scanner;

public class FindValueIn2D {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int i, j;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		findValue(a);
	}

	static void findValue(int a[][]) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("enter value to find");
		int find = sc.nextInt();
		int i, j;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				if (a[i][j] == find) {
					System.out.println(find + " is present at index :");
					System.out.print("  a[" + i + "] [" + j + "]");
					count++;
				}

			}
		}
		if (count == 0)
			System.out.println("match not found");
	}
}

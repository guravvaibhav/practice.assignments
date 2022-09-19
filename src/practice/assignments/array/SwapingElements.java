package practice.assignments.array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapingElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = { 10, 20, 30,43,87,23};
		System.out.println("enter index to swap");
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();
		int []modified=swap(input, index1, index2);
		System.out.println(Arrays.toString(modified));
	}

	public static int[] swap(int[] input, int index1, int index2) {

		input[index1] = input[index1] + input[index2];
		input[index2] = input[index1] - input[index2];
		input[index1] = input[index1] - input[index2];

		
		return input;
	}
}

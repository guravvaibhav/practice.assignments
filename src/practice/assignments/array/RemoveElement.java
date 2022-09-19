// remove given Element from given array.
package practice.assignments.array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = { 10, 24, 65, 24, 87 };

		System.out.print("enter element to remove : ");
		int element = sc.nextInt();
		int[] modified = removeElement(input, element);
		System.out.println(Arrays.toString(modified));
	}

	public static int[] removeElement(int[] input, int element) {
		int count = 0;
		int i;
		int j = 0;
		for (i = 0; i < input.length; i++) {
			if (input[i] == element)
				count++;
		}
		int[] modified = new int[input.length - count];
		for (i = 0; i < input.length ; i++) {
			if (input[i] != element) {
				modified[j] = input[i];
				j++;
			}
		}
		return modified;

	}

}

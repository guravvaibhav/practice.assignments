package practice.assignments.array;

import java.util.Arrays;

public class CompairArray {
	public static void main(String[] args) {

		int[] Array1 = {1,2,3,4,5};
		int[] Array2 =Array1;

		System.out.println(compairArray(Array1, Array2));
	}

	public static boolean compairArray(int[] array1, int[] array2) {
		if (array1 == array2)
			return true;
		if (array1.length != array2.length)
			return false;
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array2[i])
				count++;
		}
		if (array1.length == count)
			return true;
		else
			return false;
	}
}

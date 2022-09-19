package practice.assignments.array;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int [][]a=new int[3][3];
		 
	int i,j;
	for(i=0;i<a.length;i++) {
		for(j=0;j<a.length;j++){
			System.out.println("enter values of matrix for index a ["+i+"] ["+j+"]");
			a[i][j]=sc.nextInt();
		}
	}
	int transpose[][]=transpose(a);
	}

	public static int[][] transpose(int[][] a) {
		int transpose[][]=new int[3][3];
		int i;
		int j;
		System.out.println("tranpose of matrix is as follows : ");
		for(i=0;i<a.length;i++) {
			System.out.println("\n");
			for(j=0;j<a.length;j++) {
				transpose[i][j]=a[i][j];
				System.out.print("\t"+(a[j][i]));
			}
		}
		return transpose;
	}
}

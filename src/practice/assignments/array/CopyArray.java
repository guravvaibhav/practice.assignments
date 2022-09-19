package practice.assignments.array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int copy[][]=new int[3][3];
		
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.println("enter values of matrix for index a ["+i+"] ["+j+"]");
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<copy.length;i++) {
			for(j=0;j<copy.length;j++) {
				copy[i][j]=a[i][j];
			}
		}
		for(i=0;i<copy.length;i++) {
			System.out.println("\n");
			for(j=0;j<copy.length;j++) {
				System.out.print("\t"+copy[i][j]);
			}
		}
		
		System.out.println("\n"+(a==copy));
	}

}

package practice.assignments.array;

import java.util.Scanner;

public class AdditionOfMatrix {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int [][]a=new int[3][3];
	int [][]b=new int[3][3];
		 
	int i,j;
	for(i=0;i<a.length;i++) {
		for(j=0;j<a.length;j++){
			System.out.println("enter values for matrix a & b for index ["+i+"] ["+j+"]");
			a[i][j]=sc.nextInt();
			b[i][j]=sc.nextInt();
		}
	}
	System.out.println("addition matrix are as follows");
	for(i=0;i<a.length;i++) {
		System.out.print("\n");
		for(j=0;j<a.length;j++){
			System.out.print("\t"+(a[i][j]+b[i][j]));
		}
		
	}
	
	}
}

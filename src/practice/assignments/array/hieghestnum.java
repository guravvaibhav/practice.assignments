package practice.assignments.array;

import java.util.Arrays;
import java.util.Scanner;

public class hieghestnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter which hieghest no would you want eg. 1,2..etc");
		int hieghest=sc.nextInt();
		int []input= {4,5,3,8,87,7};
		heighestNum(input);
		System.out.println(input[input.length-(1-hieghest)]);
	}

	public static void heighestNum(int[] input) {
		int temp;
		for(int i=0;i<input.length;i++) {
			for(int j=i;j<input.length;j++) {
				if(input[i]>input[j]) {
					temp=input[i];
					input [i]=input[j];
					input[j]=temp;
				}
			}
		}
	}
	

}

package practice.assignments.array;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[]input= {12,23,43,87,23,19,23,48};
		removeDuplicate(input);
	}
	public static void removeDuplicate(int[]input) {
		int i,j;
		int k=0;
		int count=0;
		for(i=0;i<input.length;i++) {
			for(j=i;j<input.length;j++) {
				if(i!=j) {
				if(input[i]==input[j]) 
					count++;
				}
			}
		}
//		int []modified=new int[input.length-count];
//		for(i=0;i<input.length;i++) {
//			for(j=i;j<input.length;j++) {
//				if(i!=j) {
//				if(input[i]!=input[j]) {
//					modified[k]=input[j];
//					k++;
//				}
//				}
					
//			}
//		}
	}

}

package practice.assignments.array;

public class CalculateAverage {
	public static void main(String[] args) {
		int []input= {10,10,11};
		float average=calculateAverage(input);
		System.out.println(average);
	}
	public static float calculateAverage(int []input) {
		int count=0;
		float res=0;
		for(int i=0;i<input.length;i++) {
			res+=input[i];
			count++;
		}
		float average=res/count;
		return average;
	}
}

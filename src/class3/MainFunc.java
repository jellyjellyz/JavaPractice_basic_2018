package class3;

import java.util.Arrays;

public class MainFunc {
	public static void main (String[] args) {
		int[] arr = {2, 5, 26, 34};
		int solution = Quiz.findmax(arr);
		System.out.print(solution);
		
		int[] newarr = Quiz.insert(arr, 3, 0);
		System.out.println(Arrays.toString(newarr));
		
		newarr = Quiz.reversearr(arr);
		System.out.println(Arrays.toString(newarr));
		
	}
}

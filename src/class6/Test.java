package class6;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = {1, 9, 8, 3, 7, 2, 1, 1, 0};
		QuickSort s = new QuickSort();
		s.solution(arr);
		System.out.println(Arrays.toString(arr));
	}
}
